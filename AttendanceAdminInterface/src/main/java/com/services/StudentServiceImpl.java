package com.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dao.DataAccessObject;
import com.google.gson.Gson;

@Service("studentService")
public class StudentServiceImpl extends DataAccessObject implements StudentService {

	@Value("${student.save.api}")
	private String saveApi;
	
	@Value("${ip}")
	private String ip;
	
	@Value("${port}")
	private String port;
	
	
	public void save(Object student) throws IOException{
 
		String url = ip+port;
		String data = new Gson().toJson(student);
		sendPOST(url+saveApi, data);
	}
}
