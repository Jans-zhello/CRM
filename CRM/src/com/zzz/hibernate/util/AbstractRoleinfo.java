package com.zzz.hibernate.util;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractRoleinfo entity provides the base persistence definition of the
 * Roleinfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRoleinfo implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String roleName;
	private Set rolerelationships = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractRoleinfo() {
	}

	/** full constructor */
	public AbstractRoleinfo(String roleName, Set rolerelationships) {
		this.roleName = roleName;
		this.rolerelationships = rolerelationships;
	}

	// Property accessors

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set getRolerelationships() {
		return this.rolerelationships;
	}

	public void setRolerelationships(Set rolerelationships) {
		this.rolerelationships = rolerelationships;
	}

}