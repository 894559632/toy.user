package com.ynyes.cqhome.toy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ynyes.cqhome.toy.entity.Member;

public interface MemberDao {

	void save(Member member);

	void delete(Long id);

	void update(Member member);

	Member findOne(Long id);

	List<Member> findAll();

	/**
	 * 根据编号查找会员
	 * 
	 * @author DengXiao
	 */
	Member findByNumber(String number);

	/**
	 * 根据账号和密码查询会员
	 * 
	 * @author DengXiao
	 */
	Member findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
