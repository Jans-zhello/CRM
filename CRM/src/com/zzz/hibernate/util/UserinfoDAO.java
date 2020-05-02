package com.zzz.hibernate.util;

import java.util.List;

public interface UserinfoDAO {

	// property constants
	public static final String USER_NAME = "userName";
	public static final String USER_LOGIN_NAME = "userLoginName";
	public static final String USER_PASS_WORD = "userPassWord";
	public static final String USER_TELPHONE = "userTelphone";
	public static final String USER_EMAIL = "userEmail";

	public abstract void save(Userinfo transientInstance);

	public abstract void delete(Userinfo persistentInstance);

	public abstract Userinfo findById(java.lang.Integer id);

	public abstract List findByExample(Userinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByUserName(Object userName);

	public abstract List findByUserLoginName(Object userLoginName);

	public abstract List findByUserPassWord(Object userPassWord);

	public abstract List findByUserTelphone(Object userTelphone);

	public abstract List findByUserEmail(Object userEmail);

	public abstract List findAll();

	public abstract Userinfo merge(Userinfo detachedInstance);

	public abstract void attachDirty(Userinfo instance);

	public abstract void attachClean(Userinfo instance);

}