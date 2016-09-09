package com.cfzd.service.article;

import java.util.List;

import com.cfzd.article.bo.ArticleBO;

public interface IArticleService {
	//ͷ����Ŀ������
	public static final String ARTICLE_HEADCOLUMN ="head";
	/*����������Ŀ��ȡ����*/
	public List<ArticleBO> getArticle(String articleCateType) throws Exception;
	/*����������Ŀ��ȡ����,��ʼ����*/
	public List<ArticleBO> getArticle(String articleCateType,Long start,Long limit) throws Exception;
    /*��������*/
	public void addArticle() throws Exception;
}
