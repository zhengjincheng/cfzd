package com.cfzd.controller.article;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cfzd.service.article.IArticleService;

@Controller
@RequestMapping(value = "category")
public class CategoryController {
	@Resource
	private IArticleService service;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getCategory() throws Exception {
		ModelAndView m = new ModelAndView();
		m.addObject("articles", service.getArticle(IArticleService.ARTICLE_HEADCOLUMN));
		return m;
	}
}
