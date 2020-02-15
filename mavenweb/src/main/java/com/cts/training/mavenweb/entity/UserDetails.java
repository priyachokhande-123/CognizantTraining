package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;
import java.util.Arrays;

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
@Table(name = "users")
public class UserDetails {


	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
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
	
	
	
	
	public UserDetails() {
	
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUser_Id(Integer userId) {
		this.userId = userId;
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
		return "UserDetails [user_Id=" + userId + ", username=" + username + ", password=" + password + ", fname="
				+ fname + ", lname=" + lname + ", email=" + email + ", profilePic=" + Arrays.toString(profilePic)
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", enabled=" + enabled + "]";
	}
	
}
