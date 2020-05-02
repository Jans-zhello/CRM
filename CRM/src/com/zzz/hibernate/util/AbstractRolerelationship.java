package com.zzz.hibernate.util;

/**
 * AbstractRolerelationship entity provides the base persistence definition of
 * the Rolerelationship entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRolerelationship implements java.io.Serializable {

	// Fields

	private Integer roleRelationshipId;
	private Menuinfo menuinfo;
	private Roleinfo roleinfo;
	private Integer access;

	// Constructors

	/** default constructor */
	public AbstractRolerelationship() {
	}

	/** full constructor */
	public AbstractRolerelationship(Menuinfo menuinfo, Roleinfo roleinfo,
			Integer access) {
		this.menuinfo = menuinfo;
		this.roleinfo = roleinfo;
		this.access = access;
	}

	// Property accessors

	public Integer getRoleRelationshipId() {
		return this.roleRelationshipId;
	}

	public void setRoleRelationshipId(Integer roleRelationshipId) {
		this.roleRelationshipId = roleRelationshipId;
	}

	public Menuinfo getMenuinfo() {
		return this.menuinfo;
	}

	public void setMenuinfo(Menuinfo menuinfo) {
		this.menuinfo = menuinfo;
	}

	public Roleinfo getRoleinfo() {
		return this.roleinfo;
	}

	public void setRoleinfo(Roleinfo roleinfo) {
		this.roleinfo = roleinfo;
	}

	public Integer getAccess() {
		return this.access;
	}

	public void setAccess(Integer access) {
		this.access = access;
	}

}