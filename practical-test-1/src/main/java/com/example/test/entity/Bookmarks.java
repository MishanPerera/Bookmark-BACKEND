package com.example.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookmarks")
public class Bookmarks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name", nullable =false)
	private String name;
	
	@Column(name="url", nullable =false)
	private String url;
	
	@Column(name="description", nullable =false)
	private String description;
	
	@Column(name="status", nullable =false)
	private String status;
	
	@Column(name="expiryDate", nullable =false)
	private String expiryDate;
	
	public Bookmarks() {
		
	}

	public Bookmarks(Long id, String name, String url, String description, String status, String expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.description = description;
		this.status = status;
		this.expiryDate = expiryDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	

}
