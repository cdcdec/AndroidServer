package com.cdc.getwebsourceactions;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletRequest;

public class Headers {
	
	public static void  getHaeders(ServletRequest request){
		String contentLength=request.getContentLength()+"";
		String contentType=request.getContentType();
		String protocol=request.getProtocol();
		try {
			InputStream input=request.getInputStream();
			byte []buffer=new byte[1024];
			while(input.read()!=-1){
				input.read(buffer, 0, buffer.length);
			}
			String str=new String(buffer,"utf-8");
			
			System.out.println("str="+str);
			System.out.println("contentLength="+contentLength+",contentType="+contentType+",procol="+protocol);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
