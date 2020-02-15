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
@Table(name = "media")
public class Media {


	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer mediaId;
	
	@Column
	private Integer userId;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String fileUrl;
	
	@Column
	private String posterFileUrl;
	
	@Column
	private String mimeType;
	
	@Column
	private Boolean hide;
	
	@CreationTimestamp
	@Column
	private LocalDateTime  createdOn;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedOn;
	
	@Column
	private String tags;
	
	@Column
	private Integer size;
	
	
	
	
	public Media() {
		
	}
	
	




	public Integer getMediaId() {
		return mediaId;
	}



	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}



	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getPosterFileUrl() {
		return posterFileUrl;
	}
	public void setPosterFileUrl(String posterFileUrl) {
		this.posterFileUrl = posterFileUrl;
	}
	public String getMimeType() {
		return mimeType;
	}
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public Boolean getHide() {
		return hide;
	}
	public void setHide(Boolean hide) {
		this.hide = hide;
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
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
	

	@Override
	public String toString() {
		return "Media [mediaId=" + mediaId + ", userId=" + userId + ", title=" + title + ", description=" + description
				+ ", fileUrl=" + fileUrl + ", posterFileUrl=" + posterFileUrl + ", mimeType=" + mimeType + ", hide="
				+ hide + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", tags=" + tags + ", size=" + size
				+ "]";
	}
	
}
