package com.zzz.hibernate.util;

import java.util.List;

public interface CustomerlevelDAO {

	public static final String LEVEL_NAME = "levelName";

	public abstract void save(Customerlevel transientInstance);

	public abstract void delete(Customerlevel persistentInstance);

	public abstract Customerlevel findById(java.lang.Integer id);

	public abstract List findByExample(Customerlevel instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByBusiness(Object business);

	public abstract List findByLevelName(Object levelName);

	public abstract List findAll();

	public abstract Customerlevel merge(Customerlevel detachedInstance);

	public abstract void attachDirty(Customerlevel instance);

	public abstract void attachClean(Customerlevel instance);

}