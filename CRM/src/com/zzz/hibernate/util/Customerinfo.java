package com.zzz.hibernate.util;

/**
 * Customerinfo entity. @author MyEclipse Persistence Tools
 */
public class Customerinfo extends AbstractCustomerinfo implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Customerinfo() {
	}

	public Customerinfo(Integer customerId, Customerlevel customerLevel,
			Sjzdxx dictionaryTypeInfoByOpenBank,
			Sjzdxx dictionaryTypeInfoByCustomerType,
			Sjzdxx dictionaryTypeInfoByCustomerSource,
			Sjzdxx dictionaryTypeInfoByCustomerProperties, String customerName,
			String customerCompanyWebsize, String customerCompanyPhone,
			String register, String customerAddress, String customerProvinces,
			String customerCity, String customerCode, String bankAccount,
			String noteInformation) {
		super(customerId, customerLevel, dictionaryTypeInfoByOpenBank,
				dictionaryTypeInfoByCustomerType, dictionaryTypeInfoByCustomerSource,
				dictionaryTypeInfoByCustomerProperties, customerName,
				customerCompanyWebsize, customerCompanyPhone, register,
				customerAddress, customerProvinces, customerCity, customerCode,
				bankAccount, noteInformation);
	}

	
	
}
