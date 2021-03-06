package com.cfzd.controller.article;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cfzd.service.article.IArticleService;

@Controller
@RequestMapping(value="index")
public class IndexController {
	@Resource
	private IArticleService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getArticle() throws Exception{
		ModelAndView m=new ModelAndView();
		m.addObject("articles", service.getArticle(IArticleService.ARTICLE_HEADCOLUMN));
		return m;
	}
}
