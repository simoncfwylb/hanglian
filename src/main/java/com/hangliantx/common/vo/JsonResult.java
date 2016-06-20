package com.hangliantx.common.vo;

import java.io.Serializable;

public class JsonResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 909716283308466599L;
	
	//private static final ObjectMapper MAPPER=new ObjectMapper();
	/*返回码*/
	private int code;
	
	/*消息*/
	private String message;
	
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public JsonResult(int code, String message, Object data) {
		super();
		this.code=code;
		this.message = message;
		this.data = data;
	}

	public JsonResult() {
		super();
	}

	public JsonResult(Object data) {
		this.code=200;
		this.message="SUCCESS";
		this.data = data;
	}
	
	public Boolean isOk(){
		return this.code==200;
	}
	
	public static JsonResult ok(Object data){
		return new JsonResult(data);
	}
	
	public static JsonResult ok(){
		return ok(null);
	}
	
	public static JsonResult build(int code,String message,Object data){
		return new JsonResult(code,message,data);
	}
	

}
