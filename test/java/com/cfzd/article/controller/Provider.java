package com.cfzd.article.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "file:src/main/webapp/WEB-INF/spring/spring-dobbo.xml" });
		context.start();

		System.in.read(); // 按任意键退出
	}

}
