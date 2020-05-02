package com.zzz.hibernate.util;

import java.util.List;

public interface MenuinfoDAO {

	// property constants
	public static final String MENU_INFO_NAME = "menuInfoName";

	public abstract void save(Menuinfo transientInstance);

	public abstract void delete(Menuinfo persistentInstance);

	public abstract Menuinfo findById(java.lang.Integer id);

	public abstract List findByExample(Menuinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByMenuInfoName(Object menuInfoName);

	public abstract List findAll();

	public abstract Menuinfo merge(Menuinfo detachedInstance);

	public abstract void attachDirty(Menuinfo instance);

	public abstract void attachClean(Menuinfo instance);

}