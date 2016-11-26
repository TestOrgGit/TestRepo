package com.models.attendancemodel.common;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("editableInfo")
@Scope("singleton")
public class EditableInfo {

	private Long createdAt;
	private String createdBy;
	private List<UpdateInfo> updateInfo;
	private String dateFormat;
	public Long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public List<UpdateInfo> getUpdateInfo() {
		return updateInfo;
	}
	public void setUpdateInfo(List<UpdateInfo> updateInfo) {
		this.updateInfo = updateInfo;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	
}
