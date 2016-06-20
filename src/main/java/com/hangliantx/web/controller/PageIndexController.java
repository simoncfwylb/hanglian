package com.hangliantx.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageIndexController
{
  @RequestMapping("/page/index")
  public String toPage()
  {
    return "index";
  }
}