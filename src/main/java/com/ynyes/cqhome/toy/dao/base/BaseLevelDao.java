package com.ynyes.cqhome.toy.dao.base;

import java.util.List;

import com.ynyes.cqhome.toy.entity.base.BaseLevel;

public interface BaseLevelDao {

	void save(BaseLevel level);

	void delete(Long id);

	void update(BaseLevel level);

	BaseLevel findOne(Long id);

	List<BaseLevel> findAll();
}
