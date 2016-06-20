package com.hangliantx.common.pojo.echarts;

import java.io.Serializable;
import java.util.List;

public class Option implements Serializable{

	private static final long serialVersionUID = -3793191210889391877L;

	private List<Axis> xAxis;
	
	private List<Axis> yAxis;
	
    private List<Series> series;
    
    /**
     * 提示框（详见tooltip），鼠标悬浮交互时的信息提示
     */
    private Tooltip tooltip;
    
    /**
     * 图例（详见legend），每个图表最多仅有一个图例，混搭图表共享
     */
    private Legend legend;

	public List<Axis> getxAxis() {
		return xAxis;
	}

	public void setxAxis(List<Axis> xAxis) {
		this.xAxis = xAxis;
	}

	public List<Axis> getyAxis() {
		return yAxis;
	}

	public void setyAxis(List<Axis> yAxis) {
		this.yAxis = yAxis;
	}

	public List<Series> getSeries() {
		return series;
	}

	public void setSeries(List<Series> series) {
		this.series = series;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}
    
    
    
}
