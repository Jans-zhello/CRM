package com.zzz.hibernate.util;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractMenuinfo entity provides the base persistence definition of the
 * Menuinfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMenuinfo implements java.io.Serializable {

	// Fields

	private Integer menuInfoId;
	private String menuInfoName;
	private Set rolerelationships = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractMenuinfo() {
	}

	/** full constructor */
	public AbstractMenuinfo(String menuInfoName, Set rolerelationships) {
		this.menuInfoName = menuInfoName;
		this.rolerelationships = rolerelationships;
	}

	// Property accessors

	public Integer getMenuInfoId() {
		return this.menuInfoId;
	}

	public void setMenuInfoId(Integer menuInfoId) {
		this.menuInfoId = menuInfoId;
	}

	public String getMenuInfoName() {
		return this.menuInfoName;
	}

	public void setMenuInfoName(String menuInfoName) {
		this.menuInfoName = menuInfoName;
	}

	public Set getRolerelationships() {
		return this.rolerelationships;
	}

	public void setRolerelationships(Set rolerelationships) {
		this.rolerelationships = rolerelationships;
	}

}