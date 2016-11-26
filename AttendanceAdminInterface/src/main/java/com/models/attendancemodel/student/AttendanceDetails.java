package com.models.attendancemodel.student;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.models.attendancemodel.common.EditableInfo;

@Component("attendanceDetails")
@Scope("singleton")
public class AttendanceDetails {

	private Long date;
	private String dateFormat;
	private List<PeriodDetails> periodDetails;
	private String status;
	private String tag;
	private EditableInfo editableInfo;
	public Long getDate() {
		return date;
	}
	public void setDate(Long date) {
		this.date = date;
	}
	public List<PeriodDetails> getPeriodDetails() {
		return periodDetails;
	}
	public void setPeriodDetails(List<PeriodDetails> periodDetails) {
		this.periodDetails = periodDetails;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public EditableInfo getEditableInfo() {
		return editableInfo;
	}
	public void setEditableInfo(EditableInfo editableInfo) {
		this.editableInfo = editableInfo;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	
}
