package com.ynyes.cqhome.toy.entity.base;

import java.util.Date;

/**
 * 基础用户
 * 
 * @author DengXiao
 */
public abstract class BaseUser {

	// 自增主键
	private Long id;

	// 用户编号（唯一标识）
	private String number;

	// 用户名
	private String username;

	// 密码
	private String password;

	// 注册时间
	private Date registTime;

	// 上一次登录时间
	private Date lastLoginTime;

	// 上一次登录ip
	private String lastLoginIp;

	// 是否启用
	private Boolean isEnable;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Boolean getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}

	public Double getSortId() {
		return sortId;
	}

	public void setSortId(Double sortId) {
		this.sortId = sortId;
	}
}
