package com.cfzd.mybatis.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cfzd.article.bean.Article;
import com.cfzd.article.dao.ArticleMapper;
import com.cfzd.mybatis.bean.User;

public class TestSingleTable {
	private SqlSession session;

	@Before
	public void setUp() throws Exception {
		System.out.println("--setUp---");

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);		
		session=sqlSessionFactory.openSession();


	}

	@After
	public void tearDown() throws Exception {
		System.out.println("--tearDown--");

		if (session!=null ){
			session.close();
		}
	}

	@Test
	public void testquery() {
		User u=session.selectOne("org.mybatis.example.UserMapper.select", 23);
		System.out.println(u);
	}
	@Test
	public void testadd() {
		int u=session.insert("org.mybatis.example.UserMapper.insert", new User(-1,"Ö£½õ³Ì",35));
		session.commit();
		System.out.println(u);
	}
	@Test
	public void testupdate() {
		int u=session.update("org.mybatis.example.UserMapper.update", new User(1,"wqs",1));
		session.commit();
		System.out.println(u);
	}
	@Test
	public void testdelete() {
		int u=session.delete("org.mybatis.example.UserMapper.delete", 1);
		session.commit();
		System.out.println(u);
	}
	@Test
	public void testarticle() {
		ArticleMapper m=session.getMapper(ArticleMapper.class);
		Article article=m.selectByPrimaryKey(1);
		System.out.println(article);
	}
}
