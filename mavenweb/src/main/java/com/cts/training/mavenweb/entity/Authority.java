package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity // Registers the class as entity
//Define the mappings
@Table(name = "authorities")

public class Authority {

	@Column
	private String username;

	@Column
	private String authority;

	/*	
	public Authority() {
	
	}


	@Override
	public String toString() {
		return "Authority [username=" + username + ", authority=" + authority + "]";
	}
	
	*/
}
