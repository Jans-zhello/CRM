package com.zzz.hibernate.util;

import java.util.Set;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */
public class Userinfo extends AbstractUserinfo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** full constructor */
	public Userinfo(Userinfo userinfo, Roleinfo roleinfo, String userName,
			String userLoginName, String userPassWord, String userTelphone,
			String userEmail, Set userinfos) {
		super(userinfo, roleinfo, userName, userLoginName, userPassWord,
				userTelphone, userEmail, userinfos);
	}

}
