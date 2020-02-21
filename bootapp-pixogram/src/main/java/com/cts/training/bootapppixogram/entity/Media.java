package com.cts.training.bootapppixogram.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.omg.PortableInterceptor.USER_EXCEPTION;

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
@Table(name = "media")
public class Media {

	@ManyToOne()
	@JoinColumn(name="user_Id")
	private UserDetails user;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
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
	
	

	@OneToMany(mappedBy = "media")
	private List<NewsFeed> newsfeeds = new ArrayList<NewsFeed>();
	

	@OneToMany(mappedBy = "media")
	private List<Action> actions  = new ArrayList<Action>();
	
	@OneToMany(mappedBy = "media")
	private List<Comments> comments= new ArrayList<Comments>();
	
	/*
	public List<NewsFeed> getNewsfeeds() {
		return newsfeeds;
	}


	public void setNewsfeeds(List<NewsFeed> newsfeeds) {
		this.newsfeeds = newsfeeds;
	}

	


	public List<Action> getActions() {
		return actions;
	}


	public void setActions(List<Action> actions) {
		this.actions = actions;
	}


	public List<Comments> getComments() {
		return comments;
	}


	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}


	public UserDetails getUser() {
		return user;
	}


	public void setUser(UserDetails user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}





	public Media() {
		
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
		return "Media [user=" + user + ", id=" + id + ", title=" + title + ", description=" + description + ", fileUrl="
				+ fileUrl + ", posterFileUrl=" + posterFileUrl + ", mimeType=" + mimeType + ", hide=" + hide
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", tags=" + tags + ", size=" + size + "]";
	}
	
	
*/
	
}
