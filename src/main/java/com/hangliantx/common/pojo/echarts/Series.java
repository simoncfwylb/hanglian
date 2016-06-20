package com.hangliantx.common.pojo.echarts;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.hangliantx.common.pojo.echarts.enums.SeriesType;


public class Series implements Serializable{

	private static final long serialVersionUID = -1515314175338198895L;

	private List<String> data;

	private String name;
	
	private SeriesType type;
	
	@JsonInclude(Include.NON_NULL) 
	private String 	yAxisIndex;
	
	@JsonInclude(Include.NON_NULL) 
	private String 	xAxisIndex;

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SeriesType getType() {
		return type;
	}

	public void setType(SeriesType type) {
		this.type = type;
	}

	public String getyAxisIndex() {
		return yAxisIndex;
	}

	public void setyAxisIndex(String yAxisIndex) {
		this.yAxisIndex = yAxisIndex;
	}

	public String getxAxisIndex() {
		return xAxisIndex;
	}

	public void setxAxisIndex(String xAxisIndex) {
		this.xAxisIndex = xAxisIndex;
	}
	
	
	

}
