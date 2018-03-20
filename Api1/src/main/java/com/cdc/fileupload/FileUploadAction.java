package com.cdc.fileupload;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

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
	
	@Override
	public String execute() throws Exception {
		String path = ServletActionContext.getServletContext().getRealPath("/images");
		File file = new File(path);
		if(!file.exists()){
			file.mkdir();
		}
		//循环将批量上传的文件保存到本地
		for(int i=0;i<upload.size();i++){
			FileUtils.copyFile(upload.get(i), new File(file,uploadFileName.get(i)));
		}
		
		HttpServletRequest request=ServletActionContext.getRequest();
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		result="上传成功！"+username+","+password+",path="+path;
		
		
		return SUCCESS;
	}

}
