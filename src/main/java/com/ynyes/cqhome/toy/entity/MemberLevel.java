package com.ynyes.cqhome.toy.entity;

import com.ynyes.cqhome.toy.entity.base.BaseLevel;

/**
 * 会员等级实体类
 * 
 * @author DengXiao
 */
public class MemberLevel extends BaseLevel {

	// 累计消费额度
	private Double required;

	public Double getRequired() {
		return required;
	}

	public void setRequired(Double required) {
		this.required = required;
	}
}
