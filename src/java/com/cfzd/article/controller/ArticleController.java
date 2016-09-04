package com.cfzd.article.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cfzd.article.bo.ArticleBO;
import com.cfzd.article.service.IArticleService;

@Controller
@RequestMapping(value = "article")
public class ArticleController {
	@Resource
	private IArticleService service;

	@RequestMapping(method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody List<ArticleBO> getArticle(String articleCateType, Long start,
			Long limit) throws Exception {
		return service.getArticle(articleCateType,start,limit);
	}
	

}
