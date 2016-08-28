package com.wanggg.test.service.impl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	/**
	 * 启动dubbo服务
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		System.in.read(); // 按任意键退出
	}

}
