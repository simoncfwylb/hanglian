package com.hangliantx.pojo;

import java.io.Serializable;

import com.hangliantx.common.pojo.DefaultPojo;

/**
 * 用户基础信息
 * @author changf 2016-3-19 下午12:22:55
 *
 */
public class UserInfo extends DefaultPojo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8863906711786223995L;
	
	private  String userName;
	
	private String passWd;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	
	
	
	

}
