package com.cfzd.article.service;

import java.util.List;

import com.cfzd.article.bo.ArticleBO;

public interface IArticleService {
	/*����������Ŀ��ȡ����*/
	public List<ArticleBO> getArticle(Integer articleCateType) throws Exception;
	/*����������Ŀ��ȡ����,��ʼ����*/
	public List<ArticleBO> getArticle(Integer articleCateType,Long start,Long limit) throws Exception;
    /*��������*/
	public void addArticle() throws Exception;
}
