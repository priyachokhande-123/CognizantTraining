package com.training.spring.web.model;

import java.util.LinkedHashMap;

public class Student {
		private String uname;
		private String email;
		private String country;
		private String favouriteLanguage;
		private String[] operatingSystems;
		
		
		public Student() {
		this.countries=new LinkedHashMap<String,String>();
		this.countries.put("FR","France");
		this.countries.put("IN","INDIA");
		this.countries.put("GR","GERMANY");
		this.countries.put("US","USA");
		
		}

		private LinkedHashMap<String,String> countries;
		
		
		public LinkedHashMap<String, String> getCountries() {
			return countries;
		}
		
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getFavouriteLanguage() {
			return favouriteLanguage;
		}
		public void setFavouriteLanguage(String favouriteLanguage) {
			this.favouriteLanguage = favouriteLanguage;
		}
		public String[] getOperatingSystems() {
			return operatingSystems;
		}
		public void setOperatingSystems(String[] operatingSystems) {
			this.operatingSystems = operatingSystems;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
			if(this.email == null)
				this.email = "dummy@mail.com";
			
		}
	}


