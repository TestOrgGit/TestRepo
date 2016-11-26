package com.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.view.ViewLocation;
import com.models.admin.Credential;
import com.models.attendancemodel.student.StudentModel;
import com.services.AdminService;
import com.services.StudentService;
import com.utility.Constant;
import com.utility.ResponseData;
import com.utility.ViewResolverUtility;

@Controller
@ComponentScan("com.services")
@RequestMapping(value = "admin/student")
public class StudentController {

	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	
	@Autowired
	@Qualifier("adminService")
	private AdminService adminService;
	
	@RequestMapping(value = { "/create" }, method = RequestMethod.GET)
	public ModelAndView form(HttpServletRequest request) throws UnknownHostException {
		Map<String, Object> data = new HashMap<String, Object>();
		
		/*Extracting UserName & Token from session*/
		Credential credential = new Credential();
		credential.setUserName((String) request.getSession().getAttribute("userName"));
		credential.setTokenId((String) request.getSession().getAttribute("token"));
		
		try{
			
			ResponseData responseData = adminService.checkAuth(credential);
			
			if(responseData.getStatus().equals(Constant.ACCESS_SUCCESS_STATUS_CODE)){
				/*TODO*/
				
				/*END TODO*/
				/* Setup data to send on View */
				
				data.put("content", ViewResolverUtility.getVeviewLocation("create", "create", "student", "Student Create", "student.js"));
				
				return new ModelAndView("body", "data", data);
			}
			
			return new ModelAndView(ViewResolverUtility.getViewPageByStatusCode(responseData.getStatus()));
			
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return new ModelAndView(Constant.FIRE);

	}
	
	@RequestMapping(value = { "/uploadExcel" }, method = RequestMethod.GET)
	public ModelAndView excelform(HttpServletRequest request) throws UnknownHostException {
		Map<String, Object> data = new HashMap<String, Object>();
		
		/*Extracting UserName & Token from session*/
		Credential credential = new Credential();
		credential.setUserName((String) request.getSession().getAttribute("userName"));
		credential.setTokenId((String) request.getSession().getAttribute("token"));
		
		try{
			
			ResponseData responseData = adminService.checkAuth(credential);
			
			if(responseData.getStatus().equals(Constant.ACCESS_SUCCESS_STATUS_CODE)){
				/*TODO*/
				
				/*END TODO*/
				/* Setup data to send on View */
				
				data.put("content", ViewResolverUtility.getVeviewLocation("excelupload", "excelupload", "student", "Student Upload", "student.js"));
				
				return new ModelAndView("body", "data", data);
			}
			
			return new ModelAndView(ViewResolverUtility.getViewPageByStatusCode(responseData.getStatus()));
			
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return new ModelAndView(Constant.FIRE);
	}

	@RequestMapping(value = { "/save" }, method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("studentSignupCreate") StudentModel studentModel, BindingResult result,
			HttpServletRequest request) throws Exception {
			Map<String, Object> data = new HashMap<String, Object>();
			
			/*Extracting UserName & Token from session*/
			Credential credential = new Credential();
			credential.setUserName((String) request.getSession().getAttribute("userName"));
			credential.setTokenId((String) request.getSession().getAttribute("token"));
			
			try{
				
				ResponseData responseData = adminService.checkAuth(credential);
				
				if(responseData.getStatus().equals(Constant.ACCESS_SUCCESS_STATUS_CODE)){
					/*TODO*/
					try {
						
						studentService.save(studentModel);
						
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					/*END TODO*/
					/* Setup data to send on View */
					
					data.put("content", ViewResolverUtility.getVeviewLocation("create", "create", "student", "Student Create", "student.js"));
					
					return new ModelAndView("body", "data", data);
				}
				
				return new ModelAndView(ViewResolverUtility.getViewPageByStatusCode(responseData.getStatus()));
				
			}catch(Exception ee){
				ee.printStackTrace();
			}
			
			return new ModelAndView(Constant.FIRE);
			
	}

	@RequestMapping(value = { "/edit/{studentId}" }, method = RequestMethod.GET)
	public ModelAndView formUpdate(@PathVariable long studentId, HttpServletRequest request) throws UnknownHostException {
			Map<String, Object> data = new HashMap<String, Object>();
			
			/*Extracting UserName & Token from session*/
			Credential credential = new Credential();
			credential.setUserName((String) request.getSession().getAttribute("userName"));
			credential.setTokenId((String) request.getSession().getAttribute("token"));
			
			try{
				
				ResponseData responseData = adminService.checkAuth(credential);
				
				if(responseData.getStatus().equals(Constant.ACCESS_SUCCESS_STATUS_CODE)){
					/*TODO*/
					StudentModel studentModel = new StudentModel();

					studentModel.setStudentFirstName("RITESH");
					studentModel.setStudentLastName("SINGH");
					studentModel.setCourseName("MCA");
					studentModel.setIsMale(false);

					data.put("studentModel", null);
					/*END TODO*/
					/* Setup data to send on View */
					
					data.put("content", ViewResolverUtility.getVeviewLocation("edit", "edit", "student", "Student Edit", "student.js"));
					
					return new ModelAndView("body", "data", data);
				}
				
				return new ModelAndView(ViewResolverUtility.getViewPageByStatusCode(responseData.getStatus()));
				
			}catch(Exception ee){
				ee.printStackTrace();
			}
			
			return new ModelAndView(Constant.FIRE);
	}

	@RequestMapping(value = { "/update" }, method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("studentSignupUpdate") StudentModel studentModel, BindingResult result,
			HttpServletRequest request) throws Exception {
			Map<String, Object> data = new HashMap<String, Object>();
			
			/*Extracting UserName & Token from session*/
			Credential credential = new Credential();
			credential.setUserName((String) request.getSession().getAttribute("userName"));
			credential.setTokenId((String) request.getSession().getAttribute("token"));
			
			try{
				
				ResponseData responseData = adminService.checkAuth(credential);
				
				if(responseData.getStatus().equals(Constant.ACCESS_SUCCESS_STATUS_CODE)){
					/*TODO*/
					
					/*END TODO*/
					/* Setup data to send on View */
					
					data.put("content", ViewResolverUtility.getVeviewLocation("edit", "edit", "student", "Student Edit", "student.js"));
					
					return new ModelAndView("body", "data", data);
				}
				
				return new ModelAndView(ViewResolverUtility.getViewPageByStatusCode(responseData.getStatus()));
				
			}catch(Exception ee){
				ee.printStackTrace();
			}
			
			return new ModelAndView(Constant.FIRE);
	}

	@RequestMapping(value = { "/view/{studentId}" }, method = RequestMethod.GET)
	public ModelAndView formView(@PathVariable long studentId, HttpServletRequest request) throws UnknownHostException {
		Map<String, Object> data = new HashMap<String, Object>();
		
		/*Extracting UserName & Token from session*/
		Credential credential = new Credential();
		credential.setUserName((String) request.getSession().getAttribute("userName"));
		credential.setTokenId((String) request.getSession().getAttribute("token"));
		
		try{
			
			ResponseData responseData = adminService.checkAuth(credential);
			
			if(responseData.getStatus().equals(Constant.ACCESS_SUCCESS_STATUS_CODE)){
				/*TODO*/
				
				StudentModel studentModel = new StudentModel();

				studentModel.setStudentFirstName("RITESH");
				studentModel.setStudentLastName("SINGH");
				studentModel.setCourseName("MCA");
				studentModel.setIsMale(true);

				data.put("studentModel", studentModel);
				
				/*END TODO*/
				/* Setup data to send on View */
				
				data.put("content", ViewResolverUtility.getVeviewLocation("view", "view", "student", "Student View", "student.js"));
				
				return new ModelAndView("body", "data", data);
			}
			
			return new ModelAndView(ViewResolverUtility.getViewPageByStatusCode(responseData.getStatus()));
			
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return new ModelAndView(Constant.FIRE);
	}

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public ModelAndView list(HttpServletRequest request) throws UnknownHostException {
		Map<String, Object> data = new HashMap<String, Object>();
		
		/*Extracting UserName & Token from session*/
		Credential credential = new Credential();
		credential.setUserName((String) request.getSession().getAttribute("userName"));
		credential.setTokenId((String) request.getSession().getAttribute("token"));
		
		try{
			
			ResponseData responseData = adminService.checkAuth(credential);
			
			if(responseData.getStatus().equals(Constant.ACCESS_SUCCESS_STATUS_CODE)){
				/*TODO*/
				
				try {
					String input = "{ \"name\": \"RITESH\" }";
					Test test = new Test();
					test.setStudentFirstName("RITESH");
					test.setStatus(200);
					
					//studentService.save(test);
					
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				/*END TODO*/
				/* Setup data to send on View */
				
				data.put("content", ViewResolverUtility.getVeviewLocation("list", "list", "student", "Student List", "student.js"));
				
				return new ModelAndView("body", "data", data);
			}
			
			return new ModelAndView(ViewResolverUtility.getViewPageByStatusCode(responseData.getStatus()));
			
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return new ModelAndView(Constant.FIRE);
	}

	@RequestMapping(value = "/data", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getDefaul(ModelMap model, HttpServletRequest request) {
		Map<String, Object> data = new HashMap<String, Object>();
		
		/*Extracting UserName & Token from session*/
		Credential credential = new Credential();
		credential.setUserName((String) request.getSession().getAttribute("userName"));
		credential.setTokenId((String) request.getSession().getAttribute("token"));
		
		try{
			
			ResponseData responseData = adminService.checkAuth(credential);
			
			if(responseData.getStatus().equals(Constant.ACCESS_SUCCESS_STATUS_CODE)){
				/*TODO*/
				
				List<Object> dataList = new ArrayList<Object>();
				data.put("name", "Tiger Nixon");
				data.put("position", "System Architect");
				data.put("salary", "320,800");
				data.put("start_date", "2011/04/25");
				data.put("office", "Edinburgh");
				data.put("extn", "5421");
				dataList.add(data);
				Map<String, List<Object>> dataTable = new HashMap<String, List<Object>>();
				dataTable.put("data", dataList);
				
				return new Gson().toJson(dataTable);
			}
			
			return null;
			
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return null;
	}
	
}
