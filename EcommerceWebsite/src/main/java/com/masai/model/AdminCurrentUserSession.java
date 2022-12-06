package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminCurrentUserSession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	
	private Integer adminId;
	
	private String uuid;
	
	private LocalDateTime localDateTime;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getAdminId() {
		return adminId;
	}



	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}



	public String getUuid() {
		return uuid;
	}



	public void setUuid(String uuid) {
		this.uuid = uuid;
	}



	public AdminCurrentUserSession() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AdminCurrentUserSession(Integer adminId, String uuid, LocalDateTime localDateTime) {
		super();
		
		this.adminId = adminId;
		this.uuid = uuid;
		this.localDateTime = localDateTime;
	}



	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}



	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}



	
}
