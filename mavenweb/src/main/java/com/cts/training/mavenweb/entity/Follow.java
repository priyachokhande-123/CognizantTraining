package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name = "follow")
public class Follow {

@Column
private Integer followerId;


@ManyToOne()
@JoinColumn(name="user_Id")
private UserDetails user;

@CreationTimestamp
@Column
private LocalDateTime  createdOn;

@UpdateTimestamp
@Column
private LocalDateTime updatedOn;


/*
public Follow() {

}

public Integer getFollowerId() {
	return followerId;
}

public void setFollowerId(Integer followerId) {
	this.followerId = followerId;
}

public LocalDateTime getCreatedOn() {
	return createdOn;
}

public void setCreatedOn(LocalDateTime createdOn) {
	this.createdOn = createdOn;
}

public LocalDateTime getUpdatedOn() {
	return updatedOn;
}

public void setUpdatedOn(LocalDateTime updatedOn) {
	this.updatedOn = updatedOn;
}

*/
}
