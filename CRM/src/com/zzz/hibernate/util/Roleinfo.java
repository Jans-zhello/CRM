package com.zzz.hibernate.util;

import java.util.Set;

/**
 * Roleinfo entity. @author MyEclipse Persistence Tools
 */
public class Roleinfo extends AbstractRoleinfo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Roleinfo() {
	}

	/** full constructor */
	public Roleinfo(String roleName, Set rolerelationships) {
		super(roleName, rolerelationships);
	}

}
