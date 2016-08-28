package com.wanggg.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wanggg.test.dubbo.service.TestRegistryService;

@Controller
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private TestRegistryService testRegistryService;

	@ResponseBody
	@RequestMapping("hello")
	public String hello(){
		String hello =testRegistryService.hello("zhangsan...");
		return hello;
	}
	
}
