package com.hangliantx.pojo;

import java.io.Serializable;

import com.hangliantx.common.pojo.DefaultPojo;

/**
 * 产品类目
 * @author changf 2016-3-19 下午12:44:27
 *
 */
public class ProductKind extends DefaultPojo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9143862950825228164L;
	
	private String ProductKindName;

	public String getProductKindName() {
		return ProductKindName;
	}

	public void setProductKindName(String productKindName) {
		ProductKindName = productKindName;
	}
	
	
	
	
	
}
