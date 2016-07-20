package com.cfzd.mybatis.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

public class PageTest {
	private SqlSession session;

	@Before
	public void setUp() throws Exception {
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

	//@Test
//	public void test() {
//
//		List<User> list = session.selectList("selectIf", null, new RowBounds(2, 20));
//		PageInfo page = new PageInfo(list);
//		//测试PageInfo全部属性
//		//PageInfo包含了非常全面的分页属性
//		System.out.println("page.getPageNum() :" +page.getPageNum());
//		System.out.println("page.getPageSize() :" +page.getPageSize());
//		System.out.println("page.getStartRow() :" +page.getStartRow());
//		System.out.println("page.getEndRow() :" +page.getEndRow());
//		System.out.println("page.getTotal() :" +page.getTotal());
//		System.out.println("page.getPages() :" +page.getPages());
//		System.out.println("page.getFirstPage() :" +page.getFirstPage());
//		System.out.println("page.getLastPage() :" +page.getLastPage());
//		System.out.println("page.isHasPreviousPage() :" +page.isHasPreviousPage());
//		System.out.println("page.isHasNextPage() :" +page.isHasNextPage());
//
//		User[] l= (User[]) page.getList().toArray(new User[page.getSize()]);
//		System.out.println(l);
//
//	
//	}

}
