package io.adeptus.whatismyip.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import io.adeptus.whatismyip.models.Address;
import io.adeptus.whatismyip.services.Ipify;
import play.mvc.*;
import play.libs.ws.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	
    @Inject Ipify ipify;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    
    public CompletionStage<Result> ipify() {
    	return ipify.call().thenApply(response ->
    		ok(views.html.ipify.render(response.toString())));
    }
    
    public CompletionStage<Result> post() {
    	return ipify.post().thenApply(response ->
    		ok(views.html.heroku.render(response.getBody())));
    }

    public Result receive() {
    	JsonNode json = request().body().asJson();
    	    if(json == null) {
    	        return badRequest("Expecting Json data");
    	    } else {
    	        String ip = json.findPath("ip").textValue();
    	        if(ip == null) {
    	            return badRequest("Missing parameter [ip]");
    	        } else {
    	        	Address address = new Address(ip);
    	        	address.save();
    	            return ok("Record with " + address.ipAddress + " has been saved as of " + address.created+ "!");
    	        }
    	    }
    }
    
    public Result whatismyip() {
    	String ip = Address.find.query().order().desc("created").setMaxRows(1).findList().get(0).ipAddress;
    	return ok(views.html.ipify.render(ip));
    }
    
    public Result show() {
    	List<Address> addresses = Address.find.query().setMaxRows(10).orderBy("created desc").findList();
    	return ok(views.html.history.render(addresses));
    }
    
    
}
