package com.controllers;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.models.Employee;
import com.models.admin.Credential;
import com.services.AdminService;
import com.utility.Constant;
import com.utility.ResponseData;
import com.utility.ViewResolverUtility;
import com.view.ViewLocation;

@Controller
@ComponentScan("com.services")
@RequestMapping(value = "admin")
public class AdminController {

	@Autowired
	@Qualifier("adminService")
	private AdminService adminService;
	
	@RequestMapping(value = { "/login-form" }, method = RequestMethod.GET)
	public ModelAndView form() throws UnknownHostException {
		
		/*Setup data to send on View*/
		Map<String,Object> data = new HashMap<String,Object>();
		
		ViewLocation viewLocation = new ViewLocation();
		viewLocation.setTitle("Login");
		viewLocation.setMyJs("");
		data.put("content", viewLocation);
		
		return new ModelAndView("login", "data", data );
	}
	
	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("login") Credential credential, BindingResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String,Object> data = new HashMap<String,Object>();
		Gson g = new Gson();
		
		try{
			ResponseData responseData = adminService.login(credential);
			System.out.println(g.toJson(responseData));
			
			if(responseData.getStatus().equals(Constant.ACCESS_SUCCESS_STATUS_CODE)){
				try{
					credential = g.fromJson(g.toJson(responseData.getData()), Credential.class);
					request.getSession().setAttribute("token", credential.getTokenId());
					request.getSession().setAttribute("userName", credential.getUserName());
					System.out.println("Res Data= "+new Gson().toJson(responseData));
				
					return new ModelAndView("welcome", "data", data );
					
				}catch(Exception ee){
					ee.printStackTrace();
				}
			}
			return new ModelAndView(ViewResolverUtility.getViewPageByStatusCode(responseData.getStatus()));
			
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		return new ModelAndView(Constant.FIRE);
	}
	
}
