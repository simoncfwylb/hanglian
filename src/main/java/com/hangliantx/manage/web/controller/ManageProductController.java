package com.hangliantx.manage.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hangliantx.pojo.ProductInfo;
import com.hangliantx.service.ProductInfoService;

/**
 * 商品管理页面
 * @author changf 2016-3-21 上午10:42:35
 *
 */
@Controller
@RequestMapping("/manage")
public class ManageProductController
{
	
	private static Logger LOGGER=LoggerFactory.getLogger(ManageProductController.class);
	@Autowired
	private ProductInfoService productInfoService;

	@RequestMapping(value="/productSave",method=RequestMethod.POST)
	//@ResponseBody
	public void save(ProductInfo sample,HttpServletResponse  response
			,HttpServletRequest  request)
	{
		String[] parameterValues = request.getParameterValues("urls");
		LOGGER.info("============"+parameterValues.length);
		LOGGER.info(parameterValues[1]+"============"+parameterValues[0]);
		System.out.println("============"+parameterValues.length);
		System.out.println(parameterValues[1]+"============"+parameterValues[0]);
        response.setContentType("text/javascript;charset=UTF-8");
        response.setHeader("Cache-Control", "no-store, max-age=0, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        try {
            PrintWriter out = response.getWriter();
            out.write("chenggong");
            out.close();
        } catch (IOException e) {
        	LOGGER.warn("BaseAjaxController | outJsonString | error:" + e.getMessage());
        }
/*		LOGGER.debug("获取到存储的数据【"+sample.toString()+"】");
		System.out.println("==============");
		sample.setStatus("1");
		productInfoService.save(sample);
		return JsonResult.ok();*/
	}
	
	
	@RequestMapping(value="/productList",method=RequestMethod.GET)
	public String queryProductList(ProductInfo sample,HttpServletResponse  response
			,Model model)
	{
		LOGGER.info("【查询产品列表页面】");
/*		Pagination pager=new Pagination();
		pager.setIndex(2);
		pager.setPageSize(6);
		//List<ProductInfo> productInfos = productInfoService.get();
		 PageInfo<ProductInfo> pageInfo= productInfoService.queryByExampleForPagination(sample,pager);
		 List<ProductInfo> productInfos=pageInfo.getList();
		 model.addAttribute("pages", pageInfo.getPages());
		 model.addAttribute("curr", pageInfo.getPageNum());
		 model.addAttribute("total", pageInfo.getTotal());
		model.addAttribute("aaa", "==========11");
		model.addAttribute("productInfos", productInfos);*/
		return "hou/product-list";
	}
	
	@RequestMapping(value="/loadProductList",method=RequestMethod.GET)
	@ResponseBody
	public String loadProductList(ProductInfo sample,HttpServletResponse  response
			,Model model)
	{
		LOGGER.info("【查询产品列表数据】");
/*		Pagination pager=new Pagination();
		pager.setIndex(2);
		pager.setPageSize(6);
		//List<ProductInfo> productInfos = productInfoService.get();
		 PageInfo<ProductInfo> pageInfo= productInfoService.queryByExampleForPagination(sample,pager);
		 List<ProductInfo> productInfos=pageInfo.getList();
		 model.addAttribute("pages", pageInfo.getPages());
		 model.addAttribute("curr", pageInfo.getPageNum());
		 model.addAttribute("total", pageInfo.getTotal());
		model.addAttribute("aaa", "==========11");
		model.addAttribute("productInfos", productInfos);*/
		return "hou/product-list";
	}
	
	
	
}