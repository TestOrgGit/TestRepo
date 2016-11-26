package com.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dao.DataAccessObject;
import com.google.gson.Gson;
import com.models.admin.Credential;
import com.utility.ResponseData;

@Service("adminService")
public class AdminServiceImpl extends DataAccessObject implements AdminService {

	@Value("${admin.checkauth.api}")
	private String checkAuthApi;
	
	@Value("${admin.login.api}")
	private String loginApi;
	
	@Value("${ip}")
	private String ip;
	
	@Value("${port}")
	private String port;
	
	@Override
	public ResponseData checkAuth(Credential credential) throws IOException {
		// TODO Auto-generated method stub
		
		Gson g = new Gson();
		String url = ip+port;
		String data = new Gson().toJson(credential);
		
		/*Preparing http header*/
		Map<String, String> header = new HashMap<String, String>();
		header.put("token", credential.getTokenId());
		
		String resData = sendPOST(url+checkAuthApi, data, header);
		
		ResponseData responseData = g.fromJson(resData, ResponseData.class);
		
		if(responseData == null ){
			responseData = new ResponseData();
			responseData.setStatus("000");
		}
		
		return responseData;
	}
	
	@Override
	public ResponseData login(Credential credential) throws IOException {
		// TODO Auto-generated method stub
		
		Gson g = new Gson();
		String url = ip+port;
		String data = new Gson().toJson(credential);
		
		String resData = sendPOST(url+loginApi, data);
		
		ResponseData responseData = g.fromJson(resData, ResponseData.class);
		
		return responseData;
	}

}
