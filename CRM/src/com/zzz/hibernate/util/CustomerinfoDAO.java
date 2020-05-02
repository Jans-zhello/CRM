package com.zzz.hibernate.util;

import java.util.List;

import com.zzz.page.Page;

public interface CustomerinfoDAO {

	// property constants
	public static final String CUSTOMER_NAME = "customerName";
	public static final String CUSTOMER_PROPERTIES = "customerProperties";
	public static final String CUSTOMER_TYPE = "customerType";
	public static final String CUSTOMER_LEVEL = "customerLevel";
	public static final String CUSTOMER_COMPANY_WEBSIZE = "customerCompanyWebsize";
	public static final String CUSTOMER_COMPANY_PHONE = "customerCompanyPhone";
	public static final String REGISTER = "register";
	public static final String CUSTOMER_ADDRESS = "customerAddress";
	public static final String CUSTOMER_PROVINCES = "customerProvinces";
	public static final String CUSTOMER_CITY = "customerCity";
	public static final String CUSTOMER_CODE = "customerCode";
	public static final String OPEN_BANK = "openBank";
	public static final String BANK_ACCOUNT = "bankAccount";
	public static final String CUSTOMER_SOURCE = "customerSource";
	public static final String NOTE_INFORMATION = "noteInformation";

	public abstract void save(Customerinfo transientInstance);

	public abstract void delete(Customerinfo persistentInstance);

	public abstract Customerinfo findById(java.lang.Integer id);

	public abstract List findByExample(Customerinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByCustomerName(Object customerName);

	public abstract List findByCustomerProperties(Object customerProperties);

	public abstract List findByCustomerType(Object customerType);

	public abstract List findByCustomerLevel(Object customerLevel);

	public abstract List findByCustomerCompanyWebsize(
			Object customerCompanyWebsize);

	public abstract List findByCustomerCompanyPhone(Object customerCompanyPhone);

	public abstract List findByRegister(Object register);

	public abstract List findByCustomerAddress(Object customerAddress);

	public abstract List findByCustomerProvinces(Object customerProvinces);

	public abstract List findByCustomerCity(Object customerCity);

	public abstract List findByCustomerCode(Object customerCode);

	public abstract List findByOpenBank(Object openBank);

	public abstract List findByBankAccount(Object bankAccount);

	public abstract List findByCustomerSource(Object customerSource);

	public abstract List findByNoteInformation(Object noteInformation);

	public abstract List findAll();

	public abstract Customerinfo merge(Customerinfo detachedInstance);

	public abstract void attachDirty(Customerinfo instance);

	public abstract void attachClean(Customerinfo instance);

    public List findAll(Page page);

	public int findAllCount();

	public List findByProperty(String propertyName, Object value, Page page);

	public int findByPropertyCount(String propertyName, Object value);
}