package com.hangtx.test;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.hangliantx.pojo.ProductInfo;
import com.hangliantx.service.ProductInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext-mybatis.xml"})
public class TestProductInfo {
	
	@Autowired
	private ProductInfoService productInfoService;
	
	@Test
	public void test_productInfo(){
		List<ProductInfo> results=productInfoService.get();
		System.out.println(results.size());
		System.out.println(results.get(0).getTitle());
		
	}
	
	@Test
	//@Transactional
	public void test_insertproductInfo(){
		ProductInfo sample=new ProductInfo();
		sample.setTitle("title1");
		sample.setSell_point("maidian1");
		sample.setPrice(new BigDecimal("18.88"));
		sample.setNum(1111);
		sample.setBarcode("112312");
		sample.setImage("/sadas/asdas.jpg");
		sample.setStatus("1");
		long id=productInfoService.save(sample);
		int i=1/0;
		ProductInfo sample2=new ProductInfo();
		sample2.setTitle("title2");
		sample2.setSell_point("maidian2");
		sample2.setPrice(new BigDecimal("18.88"));
		sample2.setNum(1111);
		sample2.setBarcode("112312");
		sample2.setImage("/sadas/asdas.jpg");
		sample2.setStatus("1");
		long id2=productInfoService.save(sample2);
		System.out.println(id +"==="+sample2.getId());
		
	}

}
