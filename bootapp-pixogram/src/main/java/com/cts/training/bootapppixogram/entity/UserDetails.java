package com.cts.training.bootapppixogram.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "users")
public class UserDetails {


	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@OneToMany(mappedBy = "user")
	private List<Media> medias = new ArrayList<Media>();


	@OneToMany(mappedBy = "user")
	private List<Comments> comments = new ArrayList<Comments>();
	

	@OneToMany(mappedBy = "user")
	private List<NewsFeed> newsfeeds = new ArrayList<NewsFeed>();
	

	@OneToMany(mappedBy = "user")
	private List<Action> actions = new ArrayList<Action>();
	


	@OneToMany(mappedBy = "user")
	private List<Follow> follows = new ArrayList<Follow>();
	

	@OneToMany(mappedBy = "user")
	private List<BlockedUsers> blockedusers= new ArrayList<BlockedUsers>();
	
	/*
	
	public List<Follow> getFollows() {
		return follows;
	}



	public void setFollows(List<Follow> follows) {
		this.follows = follows;
	}



	public List<Media> getMedias() {
		return medias;
	}



	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}



	public List<Comments> getComments() {
		return comments;
	}



	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}



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

*/

	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String fname;
	
	@Column
	private String lname;
	
	@Column
	private String email;
	
	@Column
	private byte[] profilePic;
	
	@CreationTimestamp
	@Column
	private LocalDateTime  createdOn;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedOn;
	
	@Column
	private Boolean enabled;
	
	
	/*
	
	public UserDetails() {
	
	}
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte[] getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
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
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}



	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", username=" + username + ", password=" + password + ", fname=" + fname
				+ ", lname=" + lname + ", email=" + email + ", profilePic=" + Arrays.toString(profilePic)
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", enabled=" + enabled + "]";
	}
	
*/
	
	
}
