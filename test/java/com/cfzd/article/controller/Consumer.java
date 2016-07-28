package com.cfzd.article.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cfzd.article.demo.DemoService;

public class Consumer {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "file:src/spring-consumer.xml" });
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String x=demoService.sayHello("zjc");
		System.out.println(x);
		}
}