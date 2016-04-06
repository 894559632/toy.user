package com.ynyes.cqhome.toy.dao;

import java.util.List;

import com.ynyes.cqhome.toy.entity.MemberLevel;

public interface MemberLevelDao {

	void save(MemberLevel level);

	void delete(Long id);

	void update(MemberLevel level);

	MemberLevel findOne(Long id);

	List<MemberLevel> findAll();
}
