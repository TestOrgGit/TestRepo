package com.models.attendancemodel.student;

public class PeriodEditInfo {

	private String updateReason;
	private Long updatedAt;
	private String updatedBy;
	private String updationApprovedBy;
	private String updationCode;
	public String getUpdateReason() {
		return updateReason;
	}
	public void setUpdateReason(String updateReason) {
		this.updateReason = updateReason;
	}
	public Long getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Long updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdationApprovedBy() {
		return updationApprovedBy;
	}
	public void setUpdationApprovedBy(String updationApprovedBy) {
		this.updationApprovedBy = updationApprovedBy;
	}
	public String getUpdationCode() {
		return updationCode;
	}
	public void setUpdationCode(String updationCode) {
		this.updationCode = updationCode;
	}
}
