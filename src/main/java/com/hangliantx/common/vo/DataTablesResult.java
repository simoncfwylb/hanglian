package com.hangliantx.common.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 分页插件的结果集
 * @author changf 2016-3-30 下午3:19:24
 *
 */
public class DataTablesResult<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -484281066149492302L;
	
	
	private List<T> aaData;
	
	//总记录数
	private String iTotalRecords;
	
	
	

}
