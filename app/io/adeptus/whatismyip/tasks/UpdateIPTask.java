/**
 * 
 */
package io.adeptus.whatismyip.tasks;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

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

	    @Inject
	    public UpdateIPTask(ActorSystem actorSystem, ExecutionContext executionContext, Ipify ipify) {
	        this.actorSystem = actorSystem;
	        this.executionContext = executionContext;
	        this.ipify = ipify;

	        this.initialize();
	    }

	    private void initialize() {
	        this.actorSystem.scheduler().schedule(
	        	FiniteDuration.create(10, TimeUnit.SECONDS), // initialDelay
	            FiniteDuration.create(12, TimeUnit.HOURS), // interval
	            () -> {this.ipify.post();},
	            this.executionContext
	        );
	    }


}
