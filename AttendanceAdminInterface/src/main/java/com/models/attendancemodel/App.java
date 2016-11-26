package com.models.attendancemodel;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import com.models.attendancemodel.common.AddressInfo;
import com.models.attendancemodel.common.ContactInfo;
import com.models.attendancemodel.common.EditableInfo;
import com.models.attendancemodel.common.UpdateInfo;
import com.models.attendancemodel.student.AttendanceDetails;
import com.models.attendancemodel.student.LeaveDetails;
import com.models.attendancemodel.student.PeriodDetails;
import com.models.attendancemodel.student.PeriodEditInfo;
import com.models.attendancemodel.student.StudentModel;

public class App {

	public static void main(String... args){
		Gson g = new Gson();
		System.out.println("StudentModel=====================\n"+g.toJson(StudentModelFormat.getStudentModel()));
	}
}
