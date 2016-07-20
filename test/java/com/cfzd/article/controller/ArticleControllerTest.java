package com.cfzd.article.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration

@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/spring-*.xml"})

public class ArticleControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	@Before

	public void setup() throws Exception {

		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();

	}

	@Test

	public void controllerExceptionHandler() throws Exception {
		//String s=this.mockMvc.perform(MockMvcRequestBuilders.get("/article?articleCateType=1")).andReturn().getResponse().getContentAsString();

		String s=this.mockMvc.perform(MockMvcRequestBuilders.get("/index")).andReturn().getResponse().getContentAsString();
		System.out.println(s);
	}

}
