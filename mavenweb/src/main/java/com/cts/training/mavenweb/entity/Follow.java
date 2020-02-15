package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity // Registers the class as entity
//Define the mappings
@Table(name = "follow")
public class Follow {

@Column
private Integer	userId;

@Column
private Integer followerId;


@CreationTimestamp
@Column
private LocalDateTime  createdOn;

@UpdateTimestamp
@Column
private LocalDateTime updatedOn;



public Follow() {

}

public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
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


}
