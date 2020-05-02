package com.zzz.hibernate.util;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUserinfo entity provides the base persistence definition of the
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserinfo implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Userinfo userinfo;
	private Roleinfo roleinfo;
	private String userName;
	private String userLoginName;
	private String userPassWord;
	private String userTelphone;
	private String userEmail;
	private Set userinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUserinfo() {
	}

	/** full constructor */
	public AbstractUserinfo(Userinfo userinfo, Roleinfo roleinfo,
			String userName, String userLoginName, String userPassWord,
			String userTelphone, String userEmail, Set userinfos) {
		this.userinfo = userinfo;
		this.roleinfo = roleinfo;
		this.userName = userName;
		this.userLoginName = userLoginName;
		this.userPassWord = userPassWord;
		this.userTelphone = userTelphone;
		this.userEmail = userEmail;
		this.userinfos = userinfos;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Roleinfo getRoleinfo() {
		return this.roleinfo;
	}

	public void setRoleinfo(Roleinfo roleinfo) {
		this.roleinfo = roleinfo;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLoginName() {
		return this.userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserPassWord() {
		return this.userPassWord;
	}

	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}

	public String getUserTelphone() {
		return this.userTelphone;
	}

	public void setUserTelphone(String userTelphone) {
		this.userTelphone = userTelphone;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Set getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set userinfos) {
		this.userinfos = userinfos;
	}

}