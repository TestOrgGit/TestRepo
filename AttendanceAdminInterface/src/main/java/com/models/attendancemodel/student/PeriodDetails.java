package com.models.attendancemodel.student;

import java.util.List;

public class PeriodDetails {

	private String periodId;
	private String status;
	private String teacherId;
	private String statusReason;
	private String tag;
	private Long createdAt;
	private String createdBy;
	private String dateFormate;
	private List<PeriodEditInfo> periodEditInfo;
	public String getPeriodId() {
		return periodId;
	}
	public void setPeriodId(String periodId) {
		this.periodId = periodId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
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
	public String getDateFormate() {
		return dateFormate;
	}
	public void setDateFormate(String dateFormate) {
		this.dateFormate = dateFormate;
	}
	public List<PeriodEditInfo> getPeriodEditInfo() {
		return periodEditInfo;
	}
	public void setPeriodEditInfo(List<PeriodEditInfo> periodEditInfo) {
		this.periodEditInfo = periodEditInfo;
	}
}
