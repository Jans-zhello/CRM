package com.zzz.hibernate.util;

import java.util.List;

public interface SjzdflDAO {

	public abstract void save(Sjzdfl transientInstance);

	public abstract void delete(Sjzdfl persistentInstance);

	public abstract Sjzdfl findById(java.lang.Integer id);

	public abstract List findByExample(Sjzdfl instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findBySjzdflmc(Object sjzdflmc);

	public abstract List findAll();

	public abstract Sjzdfl merge(Sjzdfl detachedInstance);

	public abstract void attachDirty(Sjzdfl instance);

	public abstract void attachClean(Sjzdfl instance);

}