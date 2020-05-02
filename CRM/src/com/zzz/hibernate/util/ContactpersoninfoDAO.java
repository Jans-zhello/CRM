package com.zzz.hibernate.util;

import java.util.List;

import com.zzz.page.Page;

public interface ContactpersoninfoDAO {

	// property constants
	public static final String CONTACT_NAME = "contactName";
	public static final String CONTACT_SEX = "contactSex";
	public static final String CONTACT_POST = "contactPost";
	public static final String CONTACT_OFFICE_PHONE = "contactOfficePhone";
	public static final String CONTACT_MOBILE_PHONE = "contactMobilePhone";
	public static final String CONTACT_EMAIL = "contactEmail";
	public static final String CONTACT_QQNUMBER = "contactQqnumber";
	public static final String CONTACT_REMARKS = "contactRemarks";

	public abstract void save(Contactpersoninfo transientInstance);

	public abstract void delete(Contactpersoninfo persistentInstance);

	public abstract Contactpersoninfo findById(java.lang.Integer id);

	public abstract List findByExample(Contactpersoninfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByContactName(Object contactName);

	public abstract List findByContactSex(Object contactSex);

	public abstract List findByContactPost(Object contactPost);

	public abstract List findByContactOfficePhone(Object contactOfficePhone);

	public abstract List findByContactMobilePhone(Object contactMobilePhone);

	public abstract List findByContactEmail(Object contactEmail);

	public abstract List findByContactQqnumber(Object contactQqnumber);

	public abstract List findByContactRemarks(Object contactRemarks);

	public abstract List findAll();

	public abstract Contactpersoninfo merge(Contactpersoninfo detachedInstance);

	public abstract void attachDirty(Contactpersoninfo instance);

	public abstract void attachClean(Contactpersoninfo instance);

	public List<Contactpersoninfo> findAll(Page page);

	public int queryAllCount();

	public List<Contactpersoninfo> findByProperty(String propertyName, Object value, Page page);

	public int findByPropertyCount(String propertyName, Object value);

}