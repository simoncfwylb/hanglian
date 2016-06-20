package com.hangliantx.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hangliantx.pojo.ProductInfo;

@Repository
public interface ProductInfoMapper {
	
	public List<ProductInfo> getProductInfoList();

	public long insertProductInfo(ProductInfo productInfo);

	public int updateProductInfo(ProductInfo productInfo);

	public void deleteProductInfo(int productInfoId);
	
	public ProductInfo getProductInfo(int id);
}
