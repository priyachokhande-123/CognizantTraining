package com.cts.training.bootapppixogram.entity;

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
@Table(name = "blockedUser")
public class BlockedUsers {


	@ManyToOne()
	@JoinColumn(name="user_Id")
	private UserDetails user;

	
	@Column
	private Integer blockedUserId;
	
	@CreationTimestamp
	@Column
	private LocalDateTime  createdOn;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedOn;
	
	/*
public BlockedUsers() {
		
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBlockedUserId() {
		return blockedUserId;
	}

	public void setBlockedUserId(Integer blockedUserId) {
		this.blockedUserId = blockedUserId;
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

	@Override
	public String toString() {
		return "BlockedUsers [userId=" + userId + ", blockedUserId=" + blockedUserId + ", createdOn=" + createdOn
				+ ", updatedOn=" + updatedOn + "]";
	}

	
	*/
	
	
}
