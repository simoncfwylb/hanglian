package com.hangliantx.common.pojo.echarts;

import java.io.Serializable;
import java.util.List;

import com.hangliantx.common.pojo.echarts.enums.AxisType;


public class Axis implements Serializable{

	private static final long serialVersionUID = 8510103430674145019L;


	private List<String> data;

	/**
	 * 坐标轴名称，默认为空
	 */
	private String name;
	
	private AxisType type;
	
	private AxisLabel axisLabel;
	
	//private SplitArea splitArea;	
	
	public AxisLabel getAxisLabel() {
		return axisLabel;
	}

	public void setAxisLabel(AxisLabel axisLabel) {
		this.axisLabel = axisLabel;
	}

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

	public AxisType getType() {
		return type;
	}

	public void setType(AxisType type) {
		this.type = type;
	}
	
}
