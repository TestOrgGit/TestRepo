package com.utility;

import com.view.ViewLocation;

public class ViewResolverUtility {

	public static ViewLocation getVeviewLocation(String pageName,String fragmentTag, String section, String pageTitle, String myJs){
		ViewLocation viewLocation = new ViewLocation();
		/* this is your .html page name */
		viewLocation.setPage(pageName);
		/* Fragment tag define on your .html page at 1st line */
		viewLocation.setFragmentTag(fragmentTag);
		/* section means folder name where your .html page */
		viewLocation.setSection(section);
		viewLocation.setTitle(pageTitle);
		viewLocation.setMyJs("/resources/js/"+myJs);
		
		return viewLocation;
	}
	
	public static String getViewPageByStatusCode(String statusCode){
		if(statusCode.equals(Constant.ACCESS_DENIED_STATUS_CODE))
			return Constant.ACCESS_DENIED_STATUS_CODE;
		
		if(statusCode.equals(Constant.UNKNOWN_TOKEN__STATUS))
			return Constant.UNKNOWN_TOKEN__STATUS;
		
		if(statusCode.equals(Constant.TOKEN_EXPIRED_STATUS))
			return Constant.TOKEN_EXPIRED_STATUS;
		
		if(statusCode.equals(Constant.LOGON_FAILD_STATUS_CODE))
			return Constant.LOGON_FAILD_STATUS_CODE;
		
		if(statusCode.equals(Constant.NOT_FOUND_STATUS_CODE))
			return Constant.NOT_FOUND_STATUS_CODE;
		
		return Constant.FIRE;
	}
}
