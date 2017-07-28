/**
 * 
 */
package io.adeptus.whatismyip.tasks;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import com.typesafe.config.Config;

import akka.actor.ActorSystem;
import io.adeptus.whatismyip.services.Ipify;
import scala.concurrent.ExecutionContext;
import scala.concurrent.duration.FiniteDuration;

/**
 * @author mike
 *
 */
public class UpdateIPTask {
	
	    private final ActorSystem actorSystem;
	    private final ExecutionContext executionContext;
	    private final Ipify ipify;
		private final Config config;

	    @Inject
	    public UpdateIPTask(ActorSystem actorSystem, ExecutionContext executionContext, Ipify ipify, Config config) {
	        this.actorSystem = actorSystem;
	        this.executionContext = executionContext;
	        this.ipify = ipify;
	        this.config = config;
	        this.initialize();
	    }

	    private void initialize() {
	    	if (config.getString("appMode") == "server") {
		        this.actorSystem.scheduler().schedule(
		        	FiniteDuration.create(10, TimeUnit.SECONDS), // initialDelay
		            FiniteDuration.create(12, TimeUnit.HOURS), // interval
		            () -> {this.ipify.post();},
		            this.executionContext
		        );
	    	}
	    }


}
