package com.ynyes.cqhome.toy.entity;

import java.util.Date;

import com.ynyes.cqhome.toy.entity.base.BaseUser;

/**
 * 前台会员类
 * 
 * @author DengXiao
 */
public class Member extends BaseUser {

	// 支付密码
	private String payPassword;

	// 昵称
	private String nickname;

	// 头像（图片路径）
	private String headImgUri;

	// 身份证号
	private String identity;

	// 会员性别
	private String sex;

	// 会员年龄
	private Integer age;

	// 会员电话号码
	private String mobile;

	// 会员邮箱
	private String email;

	// 会员真实姓名
	private String realName;

	// 会员生日
	private Date birthday;

	// 账户余额
	private Double balance;

	// 冻结余额
	private Double forstBalance;

	// 总消费金额
	private Double totalConsume;

	// 会员等级编号
	private String levelNumber;

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadImgUri() {
		return headImgUri;
	}

	public void setHeadImgUri(String headImgUri) {
		this.headImgUri = headImgUri;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getForstBalance() {
		return forstBalance;
	}

	public void setForstBalance(Double forstBalance) {
		this.forstBalance = forstBalance;
	}

	public Double getTotalConsume() {
		return totalConsume;
	}

	public void setTotalConsume(Double totalConsume) {
		this.totalConsume = totalConsume;
	}

	public String getLevelNumber() {
		return levelNumber;
	}

	public void setLevelNumber(String levelNumber) {
		this.levelNumber = levelNumber;
	}
}
