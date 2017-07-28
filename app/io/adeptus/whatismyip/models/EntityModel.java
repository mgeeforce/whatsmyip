package io.adeptus.whatismyip.models;

import io.ebean.Model;
import io.ebean.annotation.CreatedTimestamp;
import io.ebean.annotation.JsonIgnore;
import io.ebean.annotation.UpdatedTimestamp;

import java.sql.Timestamp;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public class EntityModel extends Model {
	
	@Id
	public Long id;
	   
	@CreatedTimestamp
	public Timestamp created;
	
	@Version
	@UpdatedTimestamp
	@JsonIgnore
	public Timestamp updated;
   
}


