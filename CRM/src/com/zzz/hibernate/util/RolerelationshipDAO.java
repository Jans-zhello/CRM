package com.zzz.hibernate.util;

import java.util.List;

public interface RolerelationshipDAO {

	// property constants
	public static final String ACCESS = "access";

	public abstract void save(Rolerelationship transientInstance);

	public abstract void delete(Rolerelationship persistentInstance);

	public abstract Rolerelationship findById(java.lang.Integer id);

	public abstract List findByExample(Rolerelationship instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByAccess(Object access);

	public abstract List findAll();

	public abstract Rolerelationship merge(Rolerelationship detachedInstance);

	public abstract void attachDirty(Rolerelationship instance);

	public abstract void attachClean(Rolerelationship instance);

}