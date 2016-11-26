package com.controllers;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.models.Employee;
import com.view.ViewLocation;

@Controller
@RequestMapping(value = "admin/employee")
public class EmployeeController {

	@RequestMapping(value = { "/create" }, method = RequestMethod.GET)
	public ModelAndView form() throws UnknownHostException {
		
		
		
		/*Setup data to send on View*/
		Map<String,Object> data = new HashMap<String,Object>();
		
		ViewLocation viewLocation = new ViewLocation();
		/*this is your .html page name*/
		viewLocation.setPage("create");
		/*Fragment tag define on your .html page at 1st line*/
		viewLocation.setFragmentTag("create");
		/*section means folder name where your .html page*/
		viewLocation.setSection("employee");
		viewLocation.setTitle("Employee Create");
		viewLocation.setMyJs("/resources/js/employee.js");
		data.put("content", viewLocation);
		
		
		return new ModelAndView("body", "data", data );

	}
	
	@RequestMapping(value = { "/save" }, method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("studentSignupCreate") Employee employee, BindingResult result, HttpServletRequest request) throws Exception {

		
		System.out.println("Employee Details : "+new Gson().toJson(employee));
		/*Setup data to send on View*/
		Map<String,Object> data = new HashMap<String,Object>();
		
		ViewLocation viewLocation = new ViewLocation();
		viewLocation.setPage("create");
		viewLocation.setFragmentTag("create");
		viewLocation.setSection("employee");
		viewLocation.setTitle("Employee Create");
		viewLocation.setMyJs("/resources/js/employee.js");
		data.put("content", viewLocation);
		
		
		return new ModelAndView("body", "data", data );

	}
}
