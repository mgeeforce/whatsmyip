package io.adeptus.whatismyip.services;

import java.time.Duration;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.typesafe.config.Config;

import play.libs.ws.*;

public class Ipify {
	private final WSClient ws;
	private final Config config;


    @Inject
    public Ipify(WSClient ws, Config config) {
        this.ws = ws;
        this.config = config;
    }

    public CompletionStage<JsonNode> call() {
        return ws.url("https://api.ipify.org?format=json").get().thenApply(WSResponse::asJson);
    }
   
    
    /**
     * Call ipify and then post the result to app deployed on Heroku
     * @return CompletionStage<WSResponse>
     */
    public CompletionStage<WSResponse> post() {
    	// need to provide time for the Heroku to start
    	Duration timeout = Duration.ofMinutes(5); 
    	return call().thenCompose(response -> ws.url(config.getString("clientUrl")).setRequestTimeout(timeout).post(response));
    }
}
