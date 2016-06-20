package com.hangliantx.manage.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台代码逻辑跳转
 * @author changf 2016-3-19 下午6:28:50
 *
 */
@Controller
@RequestMapping("/manage")
public class PageManageController
{
	  @RequestMapping({"/{pageName}"})
	  public String toPage(@PathVariable("pageName") String pageName)
	  {
	    return "/hou/"+pageName;
	  }
}