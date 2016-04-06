package com.ynyes.cqhome.toy.dao;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.ynyes.cqhome.toy.entity.Member;

public class MemberDaoTest {

	private MemberDao memberDao;

	@Before
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		memberDao = sqlSession.getMapper(MemberDao.class);
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindOne() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByNumber() {
		Member member = memberDao.findByNumber("1");
		System.out.println(member.getId());
		System.out.println(member.getUsername());
		System.out.println(member.getPassword());
		System.out.println(member.getNumber());
	}

	@Test
	public void testFindByUsernameAndPassword() {
		Member member = memberDao.findByUsernameAndPassword("1", "1");
		System.out.println(member.getId());
		System.out.println(member.getUsername());
		System.out.println(member.getPassword());
		System.out.println(member.getNumber());
	}

}
