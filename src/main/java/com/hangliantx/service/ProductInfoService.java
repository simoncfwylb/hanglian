package com.hangliantx.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hangliantx.common.vo.Pagination;
import com.hangliantx.pojo.ProductInfo;

public interface ProductInfoService {
	
	List<ProductInfo> get();
	
	long save(ProductInfo sample);
	
	int update(ProductInfo sample);
	
	/**
	 * 条件查询
	 * @param sampel
	 * @return
	 */
	List<ProductInfo> queryByExample(ProductInfo sampel);
	
	/**
	 * 分页查询
	 */
	PageInfo<ProductInfo> queryByExampleForPagination(ProductInfo sampel,Pagination pager);
}
