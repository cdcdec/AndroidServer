package com.cdc.bean;

public class Data {
	private String data_id;
	private String data_name;
	private String data_level;
	private String data_imgpath;
	
	public Data(){}
	public Data(String data_id,String data_name,String data_level,String data_imgpath){
		this.data_id=data_id;
		this.data_imgpath=data_imgpath;
		this.data_level=data_level;
		this.data_name=data_name;
	}
	public String getData_id() {
		return data_id;
	}
	public void setData_id(String data_id) {
		this.data_id = data_id;
	}
	public String getData_name() {
		return data_name;
	}
	public void setData_name(String data_name) {
		this.data_name = data_name;
	}
	public String getData_level() {
		return data_level;
	}
	public void setData_level(String data_level) {
		this.data_level = data_level;
	}
	public String getData_imgpath() {
		return data_imgpath;
	}
	public void setData_imgpath(String data_imgpath) {
		this.data_imgpath = data_imgpath;
	}
	
	

}
