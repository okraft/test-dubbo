package com.wanggg.test.service.impl;

import com.wanggg.test.dubbo.service.TestRegistryService;

public class TestRegistryServiceImpl implements TestRegistryService{

	public String hello(String name) {
		return "hello " + name;
	}

}
