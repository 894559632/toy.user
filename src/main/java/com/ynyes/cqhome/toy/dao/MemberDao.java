package com.ynyes.cqhome.toy.dao;

import com.ynyes.cqhome.toy.dao.base.BaseUserDao;
import com.ynyes.cqhome.toy.entity.Member;

public interface MemberDao extends BaseUserDao{

	/**
	 * 根据账号和密码查询会员
	 * 
	 * @author DengXiao
	 */
	Member findByUsernameAndPassword(String username, String password);

	/**
	 * 根据账号和密码查找启用的会员
	 * 
	 * @author DengXiao
	 */
	Member findByUsernameAndPasswordAndIsEnableTrue(String username, String password);
}
