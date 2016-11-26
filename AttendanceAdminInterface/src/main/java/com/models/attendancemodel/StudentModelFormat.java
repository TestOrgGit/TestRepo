package com.models.attendancemodel;

import java.util.ArrayList;
import java.util.List;

import com.models.attendancemodel.common.AddressInfo;
import com.models.attendancemodel.common.ContactInfo;
import com.models.attendancemodel.common.EditableInfo;
import com.models.attendancemodel.common.UpdateInfo;
import com.models.attendancemodel.student.AttendanceDetails;
import com.models.attendancemodel.student.LeaveDetails;
import com.models.attendancemodel.student.PeriodDetails;
import com.models.attendancemodel.student.PeriodEditInfo;
import com.models.attendancemodel.student.StudentModel;

public class StudentModelFormat {

	public static StudentModel getStudentModel(){
		StudentModel studentModel = new StudentModel();
		studentModel.setAddressInfo(getAddressInfo());
		studentModel.setAttendanceDetails(getAttendanceDetails());
		studentModel.setContactInfo(getContactInfo());
		studentModel.setCourseCode("data");
		studentModel.setCourseName("data");
		studentModel.setCurrentSlot("data");
		studentModel.setEditableInfo(getEditableInfo());
		studentModel.setEnrolnmentNo(345346L);
		studentModel.setId("data");
		studentModel.setLeaveDetails(getLeaveDetails());
		studentModel.setRollNo(3453456L);
		studentModel.setStudentFirstName("data");
		studentModel.setStudentLastName("data");
		studentModel.setTag("data");
		studentModel.setTotalSlot("data");
		studentModel.setType("data");
		return studentModel;
	}
	
	public static ContactInfo getContactInfo(){
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setContactNo("data");
		contactInfo.setEmailId("data");
		return contactInfo;
	}
	
	public static AddressInfo getAddressInfo(){
		AddressInfo addressInfo = new AddressInfo();
		addressInfo.setAddress("data");
		addressInfo.setCity("data");
		addressInfo.setCountry("data");
		addressInfo.setPincode("data");
		addressInfo.setState("data");
		return addressInfo;
	}
	
	public static EditableInfo getEditableInfo(){
		EditableInfo editableInfo = new EditableInfo(); 
		List<UpdateInfo> updateInfo = new ArrayList<UpdateInfo>();
		UpdateInfo up = new UpdateInfo();
		up.setDescription("data");
		up.setTag("data");
		up.setUpdatedAt(34534L);
		up.setUpdatedBy("data");
		updateInfo.add(up);
		editableInfo.setCreatedAt(3453L);
		editableInfo.setCreatedBy("data");
		editableInfo.setDateFormat("data");
		editableInfo.setUpdateInfo(updateInfo);
		return editableInfo;
	}
	
	public static List<AttendanceDetails> getAttendanceDetails(){
		List<AttendanceDetails> attendanceDetails = new ArrayList<AttendanceDetails>();
		
		AttendanceDetails data = new AttendanceDetails();
		
		List<PeriodDetails> periodDetails = new ArrayList<PeriodDetails>();
		List<PeriodEditInfo> periodEditInfo = new ArrayList<PeriodEditInfo>();
		PeriodEditInfo pe = new PeriodEditInfo();
		pe.setUpdatedAt(345L);
		pe.setUpdatedBy("data");
		pe.setUpdateReason("data");
		pe.setUpdationApprovedBy("data");
		pe.setUpdationCode("data");
		periodEditInfo.add(pe);
		PeriodDetails pd = new PeriodDetails();
		pd.setCreatedAt(5345L);
		pd.setCreatedBy("data");
		pd.setDateFormate("data");
		pd.setPeriodEditInfo(periodEditInfo);
		pd.setPeriodId("data");
		pd.setStatus("data");
		pd.setStatusReason("data");
		pd.setTag("data");
		pd.setTeacherId("data");
		periodDetails.add(pd);
		data.setDate(234523L);
		data.setDateFormat("data");
		data.setEditableInfo(getEditableInfo());
		data.setPeriodDetails(periodDetails);
		data.setStatus("data");
		data.setTag("data");
		attendanceDetails.add(data);
		return attendanceDetails;
	}
	
	public static List<LeaveDetails> getLeaveDetails(){
		List<LeaveDetails> leaveDetails = new ArrayList<LeaveDetails>();
		LeaveDetails data = new LeaveDetails();
		data.setApplyDate(345346L);
		data.setApplyTo("data");
		data.setApproveFrom("data");
		data.setCancelBy("data");
		data.setCancelRemark("data");
		data.setDate(2345325L);
		data.setDateFormat("data");
		data.setEditableInfo(getEditableInfo());
		data.setFromDate(235235L);
		data.setLeaveId("data");
		data.setLeaveType("data");
		data.setReason("data");
		data.setTag("data");
		data.setToDate(3453456L);
		leaveDetails.add(data);
		return leaveDetails;
	}
}
