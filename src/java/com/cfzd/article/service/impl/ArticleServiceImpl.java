package com.cfzd.article.service.impl;

import java.util.ArrayList;
import java.util.Collection;
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
	public List<ArticleBO> getArticle(String articleCateType) throws Exception {
		Collection<Article> a = dao.selectByArticleCateType(articleCateType);
		List<ArticleBO> bos = toArticleBOs(a);
		return bos;
	}

	@Override
	public List<ArticleBO> getArticle(String articleCateType, Long start, Long limit) throws Exception {
		Article a = dao.selectByPrimaryKey(1);
		ArticleBO bo = toArticleBO(a);
		ArrayList<ArticleBO> bos = new ArrayList<ArticleBO>();
		bos.add(bo);
		return bos;
	}

	@Override
	public void addArticle() throws Exception {

	}

	public List<ArticleBO> toArticleBOs(Collection<Article> a) {
		if (a != null && !a.isEmpty()) {
			ArrayList<ArticleBO> bos = new ArrayList<ArticleBO>();
			for (Article item : a) {
				ArticleBO bo = toArticleBO(item);
				bos.add(bo);
			}
			return bos;
		}
		return null;
	}

	public ArticleBO toArticleBO(Article a) {
		if (a == null)
			return null;
		ArticleBO bo = new ArticleBO();
		bo.setId(a.getId());
		bo.setTitle(a.getTitle());
		bo.setImage(a.getImage());
		bo.setAticleCateId(a.getAticleCateId());
		bo.setIcon(a.getIcon());
		return bo;
	}

}
