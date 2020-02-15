package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity // Registers the class as entity
//Define the mappings
@Table(name = "authorities")

public class Authority {

	@Column
	private String username;

	@Column
	private String authority;

		
	public Authority() {
	
	}


	@Override
	public String toString() {
		return "Authority [username=" + username + ", authority=" + authority + "]";
	}
	
	
}
