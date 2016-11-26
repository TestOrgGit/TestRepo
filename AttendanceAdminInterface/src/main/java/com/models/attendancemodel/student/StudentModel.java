package com.models.attendancemodel.student;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.models.attendancemodel.common.AddressInfo;
import com.models.attendancemodel.common.ContactInfo;
import com.models.attendancemodel.common.EditableInfo;

@Component("studentModel")
@Scope("singleton")
public class StudentModel {

	private String id;
	private String studentFirstName;
	private String studentLastName;
	private String courseName;
	private Long enrolnmentNo;
	private Long rollNo;
	private boolean isMale;
	private String courseCode;
	private String type;
	private String currentSlot;
	private String totalSlot;
	private ContactInfo contactInfo;
	private AddressInfo addressInfo;
	private List<AttendanceDetails> attendanceDetails;
	private List<LeaveDetails> leaveDetails;
	private String tag;
	private EditableInfo editableInfo;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Long getEnrolnmentNo() {
		return enrolnmentNo;
	}
	public void setEnrolnmentNo(Long enrolnmentNo) {
		this.enrolnmentNo = enrolnmentNo;
	}
	public Long getRollNo() {
		return rollNo;
	}
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCurrentSlot() {
		return currentSlot;
	}
	public void setCurrentSlot(String currentSlot) {
		this.currentSlot = currentSlot;
	}
	public String getTotalSlot() {
		return totalSlot;
	}
	public void setTotalSlot(String totalSlot) {
		this.totalSlot = totalSlot;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	public AddressInfo getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}
	public List<AttendanceDetails> getAttendanceDetails() {
		return attendanceDetails;
	}
	public void setAttendanceDetails(List<AttendanceDetails> attendanceDetails) {
		this.attendanceDetails = attendanceDetails;
	}
	public List<LeaveDetails> getLeaveDetails() {
		return leaveDetails;
	}
	public void setLeaveDetails(List<LeaveDetails> leaveDetails) {
		this.leaveDetails = leaveDetails;
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
	public boolean getIsMale() {
		return isMale;
	}
	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	
}
