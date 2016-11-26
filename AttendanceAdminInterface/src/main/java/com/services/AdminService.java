package com.services;

import java.io.IOException;

import com.models.admin.Credential;
import com.utility.ResponseData;

public interface AdminService {

	public ResponseData checkAuth(Credential credential) throws IOException;
	
	public ResponseData login(Credential credential) throws IOException;
}
