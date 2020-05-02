package com.zzz.hibernate.util;

/**
 * AbstractCustomerinfo entity provides the base persistence definition of the
 * Customerinfo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCustomerinfo implements java.io.Serializable {

	private Integer customerId;
	private Customerlevel customerLevel;
	private Sjzdxx dictionaryTypeInfoByOpenBank;
	private Sjzdxx dictionaryTypeInfoByCustomerType;
	private Sjzdxx dictionaryTypeInfoByCustomerSource;
	private Sjzdxx dictionaryTypeInfoByCustomerProperties;
	private String customerName;
	private String customerCompanyWebsize;
	private String customerCompanyPhone;
	private String register;
	private String customerAddress;
	private String customerProvinces;
	private String customerCity;
	private String customerCode;
	private String bankAccount;
	private String noteInformation;

	public AbstractCustomerinfo() {

	}

	public AbstractCustomerinfo(Integer customerId,
			Customerlevel customerLevel, Sjzdxx dictionaryTypeInfoByOpenBank,
			Sjzdxx dictionaryTypeInfoByCustomerType,
			Sjzdxx dictionaryTypeInfoByCustomerSource,
			Sjzdxx dictionaryTypeInfoByCustomerProperties, String customerName,
			String customerCompanyWebsize, String customerCompanyPhone,
			String register, String customerAddress, String customerProvinces,
			String customerCity, String customerCode, String bankAccount,
			String noteInformation) {
		super();
		this.customerId = customerId;
		this.customerLevel = customerLevel;
		this.dictionaryTypeInfoByOpenBank = dictionaryTypeInfoByOpenBank;
		this.dictionaryTypeInfoByCustomerType = dictionaryTypeInfoByCustomerType;
		this.dictionaryTypeInfoByCustomerSource = dictionaryTypeInfoByCustomerSource;
		this.dictionaryTypeInfoByCustomerProperties = dictionaryTypeInfoByCustomerProperties;
		this.customerName = customerName;
		this.customerCompanyWebsize = customerCompanyWebsize;
		this.customerCompanyPhone = customerCompanyPhone;
		this.register = register;
		this.customerAddress = customerAddress;
		this.customerProvinces = customerProvinces;
		this.customerCity = customerCity;
		this.customerCode = customerCode;
		this.bankAccount = bankAccount;
		this.noteInformation = noteInformation;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Customerlevel getCustomerLevel() {
		return customerLevel;
	}

	public void setCustomerLevel(Customerlevel customerLevel) {
		this.customerLevel = customerLevel;
	}

	public Sjzdxx getDictionaryTypeInfoByOpenBank() {
		return dictionaryTypeInfoByOpenBank;
	}

	public void setDictionaryTypeInfoByOpenBank(
			Sjzdxx dictionaryTypeInfoByOpenBank) {
		this.dictionaryTypeInfoByOpenBank = dictionaryTypeInfoByOpenBank;
	}

	public Sjzdxx getDictionaryTypeInfoByCustomerType() {
		return dictionaryTypeInfoByCustomerType;
	}

	public void setDictionaryTypeInfoByCustomerType(
			Sjzdxx dictionaryTypeInfoByCustomerType) {
		this.dictionaryTypeInfoByCustomerType = dictionaryTypeInfoByCustomerType;
	}

	public Sjzdxx getDictionaryTypeInfoByCustomerSource() {
		return dictionaryTypeInfoByCustomerSource;
	}

	public void setDictionaryTypeInfoByCustomerSource(
			Sjzdxx dictionaryTypeInfoByCustomerSource) {
		this.dictionaryTypeInfoByCustomerSource = dictionaryTypeInfoByCustomerSource;
	}

	public Sjzdxx getDictionaryTypeInfoByCustomerProperties() {
		return dictionaryTypeInfoByCustomerProperties;
	}

	public void setDictionaryTypeInfoByCustomerProperties(
			Sjzdxx dictionaryTypeInfoByCustomerProperties) {
		this.dictionaryTypeInfoByCustomerProperties = dictionaryTypeInfoByCustomerProperties;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCompanyWebsize() {
		return customerCompanyWebsize;
	}

	public void setCustomerCompanyWebsize(String customerCompanyWebsize) {
		this.customerCompanyWebsize = customerCompanyWebsize;
	}

	public String getCustomerCompanyPhone() {
		return customerCompanyPhone;
	}

	public void setCustomerCompanyPhone(String customerCompanyPhone) {
		this.customerCompanyPhone = customerCompanyPhone;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerProvinces() {
		return customerProvinces;
	}

	public void setCustomerProvinces(String customerProvinces) {
		this.customerProvinces = customerProvinces;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getNoteInformation() {
		return noteInformation;
	}

	public void setNoteInformation(String noteInformation) {
		this.noteInformation = noteInformation;
	}

}