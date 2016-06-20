package com.hangliantx.common.vo;

import java.io.Serializable;

/**
 * 分页信息
 * @author changf 2016-3-21 上午11:01:47
 *
 */
public class Pagination implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3741518511504010051L;
	
	/*当前所属*/
	private int index;
	
	/*页数大小*/
	private int pageSize;
	
	/*总页数大小*/
	private int total;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
