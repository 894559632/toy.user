package com.ynyes.cqhome.toy.entity.base;

/**
 * 基础等级类
 * 
 * @author DengXiao
 */
public abstract class BaseLevel {

	// 自增主键
	private Long id;

	// 等级编号（唯一标识）
	private String number;

	// 等级标题
	private String title;

	// 等级级别，数字越小级别越高
	private Long rank;

	// 是否为默认等级
	private Boolean isDefault;

	// 排序号
	private Double sortId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public Double getSortId() {
		return sortId;
	}

	public void setSortId(Double sortId) {
		this.sortId = sortId;
	}
}
