package com.cdc.api1;


import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 上传文件及参数，并返回json数据.
 * @author aaron
 * 访问:http://ip/api/mobileupload
 * 
 * post:username===>cdc,password===>123,upload==>1.jpg,2.png
 * 
 * 
 * 返回:{"username":"cdc","password":"123","files":["1.jpg","2.png"]}
 *
 */
public class MobileUploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6678822504473181387L;

	private List<File> upload;

	public List<File> getUpload() {
		return upload;
	}

	public void setUpload(List<File> upload) {
		this.upload = upload;
	}

	public List<String> getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public List<String> getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	private List<String> uploadContentType;

	private List<String> uploadFileName;

	private String result;
	
	private ServletResponse response;

	@Override
	public String execute() throws Exception {
		BackData backData = new BackData();
		List<String> list = new ArrayList<String>();
		String path="";
		if (upload != null && upload.size() > 0) {
			 path = ServletActionContext.getServletContext().getRealPath("/images");
			File file = new File(path);
			if (!file.exists()) {
				file.mkdir();
			}
			// 循环将批量上传的文件保存到本地
			for (int i = 0; i < upload.size(); i++) {
				FileUtils.copyFile(upload.get(i), new File(file, uploadFileName.get(i)));
				list.add(uploadFileName.get(i));
			}
			backData.setFiles(list);
		}
		HttpServletRequest request = ServletActionContext.getRequest();
		response=ServletActionContext.getResponse();
		Gson gson = new Gson();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		backData.setUsername(username);
		backData.setPassword(password);
		result = gson.toJson(backData);
		PrintWriter p=response.getWriter();
		p.print(result);
		return null;
	}

	class BackData {
		private String username;
		private String password;
		private List<String> files;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<String> getFiles() {
			return files;
		}

		public void setFiles(List<String> files) {
			this.files = files;
		}

	}

}
