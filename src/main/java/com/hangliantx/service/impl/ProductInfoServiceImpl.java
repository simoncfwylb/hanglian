package com.hangliantx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hangliantx.common.vo.Pagination;
import com.hangliantx.mapper.ProductInfoMapper;
import com.hangliantx.pojo.ProductInfo;
import com.hangliantx.service.ProductInfoService;

@Service("productInfoService")
public class ProductInfoServiceImpl  implements ProductInfoService{

	@Autowired
	private ProductInfoMapper productInfoMapper;
	
	public List<ProductInfo> get() {
		return productInfoMapper.getProductInfoList();
	}

	public long save(ProductInfo sample) {
		//return productInfoMapper.insertProductInfo(productInfo);
		return productInfoMapper.insertProductInfo(sample);
	}

	public int update(ProductInfo sample) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ProductInfo> queryByExample(ProductInfo sampel) {
		return null;
	}

	public PageInfo<ProductInfo> queryByExampleForPagination(ProductInfo sampel,
			Pagination pager) {
		PageHelper.startPage(pager.getIndex(), pager.getPageSize());
		List<ProductInfo> list = productInfoMapper.getProductInfoList();   
		return new PageInfo<ProductInfo>(list);
	}


}
