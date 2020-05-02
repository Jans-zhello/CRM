package com.zzz.hibernate.util;

import java.util.List;

import com.zzz.page.Page;

public interface RoleinfoDAO {

	// property constants
	public static final String ROLE_NAME = "roleName";

	public abstract void save(Roleinfo transientInstance);

	public abstract void delete(Roleinfo persistentInstance);

	public abstract Roleinfo findById(java.lang.Integer id);

	public abstract List findByExample(Roleinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByRoleName(Object roleName);

	public abstract List findAll();

	public abstract Roleinfo merge(Roleinfo detachedInstance);

	public abstract void attachDirty(Roleinfo instance);

	public abstract void attachClean(Roleinfo instance);

	public abstract int findAllCount();

	public abstract List findAllRolesList(Page page);
}