package io.adeptus.whatismyip.services;

import java.util.concurrent.CompletionStage;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import play.libs.ws.*;

public class Ipify {
	private final WSClient ws;

    @Inject
    public Ipify(WSClient ws) {
        this.ws = ws;
    }

    public CompletionStage<JsonNode> call() {     
        return ws.url("https://api.ipify.org?format=json").get().thenApply(WSResponse::asJson);
    }
   
    public CompletionStage<WSResponse> post() {
    	return call().thenCompose(response -> ws.url("http://localhost:9000").post(response));
    }
}
