/**
 * 
 */
package io.adeptus.whatismyip.models;

import javax.persistence.Entity;

import io.ebean.Finder;

/**
 * @author mike
 *
 */
@Entity
public class Address extends EntityModel {
	
	public String ipAddress;
	
	public Address(String ip) {
		this.ipAddress = ip;
	}
	
	public static final Finder<Long, Address> find = new Finder<>(Address.class);
	

}
