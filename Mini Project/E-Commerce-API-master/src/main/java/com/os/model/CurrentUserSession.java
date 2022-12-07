package com.os.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class CurrentUserSession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer currSessionId;

	public Integer getCurrSessionId() {
		return currSessionId;
	}

	public void setCurrSessionId(Integer currSessionId) {
		this.currSessionId = currSessionId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getLoginDateTime() {
		return loginDateTime;
	}

	public void setLoginDateTime(LocalDateTime loginDateTime) {
		this.loginDateTime = loginDateTime;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	@NotNull(message = "Email is require")
	@Email
	private String email;

	@NotNull(message = "Date time is require")
	private LocalDateTime loginDateTime;

	@NotNull(message = "Role is require")
	private String role;

	private String privateKey;

	

}
