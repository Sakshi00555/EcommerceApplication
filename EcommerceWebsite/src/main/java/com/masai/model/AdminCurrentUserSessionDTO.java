package com.masai.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminCurrentUserSessionDTO {
	
	public AdminCurrentUserSessionDTO(Integer adminId, String uuid, LocalDateTime localDateTime) {
		super();
		this.adminId = adminId;
		this.uuid = uuid;
		this.localDateTime = localDateTime;
	}

	private Integer adminId;
	
	private String uuid;
	
	private LocalDateTime localDateTime;

	

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

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	

}
