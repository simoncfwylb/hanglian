package com.hangliantx.common.pojo.echarts;

import java.io.Serializable;
import java.util.List;

public class Legend implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7524011144513294234L;
	
	private List<String> data;

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}
	
	

}
