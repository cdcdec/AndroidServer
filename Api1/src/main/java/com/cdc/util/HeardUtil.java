package com.cdc.util;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import com.cdc.bean.Header;

public class HeardUtil {
	
	
	private static final  String HOST="host";
	private static final String CONNECTION="connection";
	private static final String CACHE_CONTROL="cache-control";
	private static final String UPGRADE_INSECURE_REQUESTS="upgrade-insecure-requests";
	private static final String ACCEPT="accept";
	private static final String ACCEPT_ENCODING="accept-encoding";
	private static final String ACCEPT_LANGUAGE="accept-language";
	private static final String COOKIE="cookie";
	private static final String USER_AGENT="user-agent";
	private static final String X_WAP_PROFILE="x-wap-profile";
	private static final String X_GETZIP="x-getzip";
	
	public HeardUtil(){
		
	}
	
	public Header createHeader(HttpServletRequest request){
		Header header=new Header();
		Enumeration<String> strs = request.getHeaderNames();
		while (strs.hasMoreElements()) {
			String aa=strs.nextElement();
			getHeader(aa,header,request);
		}
		return header;
		
	}
	
	private void getHeader(String str,Header header,HttpServletRequest request){
		String value=request.getHeader(str);
		StringBuilder sb=new StringBuilder();
		System.out.println(str);
		switch (str) {
		case HOST:
			header.setHost(value);
			break;
		case CONNECTION:
			header.setConnection(value);
			break;
		case CACHE_CONTROL:
			header.setCache_control(value);
			break;
		case UPGRADE_INSECURE_REQUESTS:
			header.setUpgrade_insecure_requests(value);
			break;
		case ACCEPT:
			header.setAccept(value);
			break;
		case ACCEPT_ENCODING:
			header.setAccept_encoding(value);
			break;
		case ACCEPT_LANGUAGE:
			header.setAccept_language(value);
			break;
		case COOKIE:
			header.setCookie(value);
			break;
		case USER_AGENT:
			header.setUser_agent(value);
			break;
		case X_WAP_PROFILE:
			header.setX_wap_profile(value);
			break;
		case X_GETZIP:
			header.setX_getzip(value);
			break;
		default:
			if(str.length()>0){
				sb.append(str+":");
				sb.append(value+",");
			}
			break;
		}
		if(sb.length()>0){
			sb.deleteCharAt(sb.length()-1);
			header.setUnknown(sb.toString());
		}
	}

}
