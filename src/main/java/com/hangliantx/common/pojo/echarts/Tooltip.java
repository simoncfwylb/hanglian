package com.hangliantx.common.pojo.echarts;

import java.io.Serializable;
import com.hangliantx.common.pojo.echarts.enums.Trigger;


public class Tooltip implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3700904977123461707L;
	
	private Trigger trigger;
	
	private String formatter;
	
	

	public String getFormatter() {
		return formatter;
	}

	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}

	public Trigger getTrigger() {
		return trigger;
	}

	public void setTrigger(Trigger trigger) {
		this.trigger = trigger;
	}
	
	
	
}
