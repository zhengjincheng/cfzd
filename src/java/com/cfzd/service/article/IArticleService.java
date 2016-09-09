package com.cfzd.service.article;

import java.util.List;

import com.cfzd.article.bo.ArticleBO;

public interface IArticleService {
	//头条栏目的文章
	public static final String ARTICLE_HEADCOLUMN ="head";
	/*根据文章栏目获取文章*/
	public List<ArticleBO> getArticle(String articleCateType) throws Exception;
	/*根据文章栏目获取文章,开始结束*/
	public List<ArticleBO> getArticle(String articleCateType,Long start,Long limit) throws Exception;
    /*增加文章*/
	public void addArticle() throws Exception;
}
