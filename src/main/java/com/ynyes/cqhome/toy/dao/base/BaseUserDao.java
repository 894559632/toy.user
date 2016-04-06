package com.ynyes.cqhome.toy.dao.base;

import java.util.List;

import com.ynyes.cqhome.toy.entity.base.BaseUser;

public interface BaseUserDao {

	void save(BaseUser user);

	void delete(Long id);

	void update(BaseUser user);

	BaseUser findOne(Long id);

	List<BaseUser> findAll();
}
