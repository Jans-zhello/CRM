package com.zzz.hibernate.util;

import java.util.List;

public interface SjzdxxDAO {

	public abstract void save(Sjzdxx transientInstance);

	public abstract void delete(Sjzdxx persistentInstance);

	public abstract Sjzdxx findById(java.lang.Integer id);

	public abstract List findByExample(Sjzdxx instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findBySjzdxxmc(Object sjzdxxmc);

	public abstract List findAll();

	public abstract Sjzdxx merge(Sjzdxx detachedInstance);

	public abstract void attachDirty(Sjzdxx instance);

	public abstract void attachClean(Sjzdxx instance);

}