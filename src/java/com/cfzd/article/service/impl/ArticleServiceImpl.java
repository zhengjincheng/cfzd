package com.cfzd.article.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cfzd.article.bean.Article;
import com.cfzd.article.bo.ArticleBO;
import com.cfzd.article.dao.ArticleMapper;
import com.cfzd.article.service.IArticleService;
@Service("ArticleService")  

public class ArticleServiceImpl implements IArticleService {
	@Resource  
	private ArticleMapper dao;

	@Override
	public List<ArticleBO> getArticle(Integer articleCateType) throws Exception {
		Article a=dao.selectByPrimaryKey(1);
		ArticleBO bo=new ArticleBO();
		bo.setId(a.getId());
		bo.setTitle(a.getTitle());
		bo.setImage(a.getImage());
		List<ArticleBO> l=new ArrayList<ArticleBO>();
		l.add(bo);
		return l;
	}

	@Override
	public List<ArticleBO> getArticle(Integer articleCateType, Long start, Long limit) throws Exception {
		return null;
	}

	@Override
	public void addArticle() throws Exception {

	}

}
