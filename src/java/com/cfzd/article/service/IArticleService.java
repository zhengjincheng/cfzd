package com.cfzd.article.service;

import java.util.List;

import com.cfzd.article.bo.ArticleBO;

public interface IArticleService {
	/*根据文章栏目获取文章*/
	public List<ArticleBO> getArticle(Integer articleCateType) throws Exception;
	/*根据文章栏目获取文章,开始结束*/
	public List<ArticleBO> getArticle(Integer articleCateType,Long start,Long limit) throws Exception;
    /*增加文章*/
	public void addArticle() throws Exception;
}
