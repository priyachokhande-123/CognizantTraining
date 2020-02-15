package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity // Registers the class as entity
//Define the mappings
@Table(name = "newsfeed")
public class NewsFeed {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Integer userId;
	
	@Column
	private String feed;
	
	@Column
	private Integer mediaId;
	

	@CreationTimestamp
	@Column
	private LocalDateTime  createdOn;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedOn;
	
	

	public NewsFeed() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}

	public Integer getMediaId() {
		return mediaId;
	}

	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
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
		return "NewsFeed [id=" + id + ", userId=" + userId + ", feed=" + feed + ", mediaId=" + mediaId + ", createdOn="
				+ createdOn + ", updatedOn=" + updatedOn + "]";
	}
	
	
	


}
