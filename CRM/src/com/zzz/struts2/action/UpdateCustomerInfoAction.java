package com.zzz.struts2.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Customerinfo;
import com.zzz.hibernate.util.Customerlevel;
import com.zzz.hibernate.util.Sjzdxx;
import com.zzz.struts2.service.CustomerinfoService;

public class UpdateCustomerInfoAction extends ActionSupport {
	private String customerName;
	private Integer customerPropertiesId;
	private Integer customerTypeId;
	private Integer levelId;
	private String customerCompanyWebsize;
	private String customerCompanyPhone;
	private String register;
	private String customerAddress;
	private String customerProvinces;
	private String customerCity;
	private String customerCode;
	private Integer openBankId;
	private String bankAccount;
	private Integer customerSourceId;
	private String noteInformation;
	
	private CustomerinfoService customerinfoService;
	

	public CustomerinfoService getCustomerinfoService() {
		return customerinfoService;
	}

	public void setCustomerinfoService(CustomerinfoService customerinfoService) {
		this.customerinfoService = customerinfoService;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCustomerPropertiesId() {
		return customerPropertiesId;
	}

	public void setCustomerPropertiesId(Integer customerPropertiesId) {
		this.customerPropertiesId = customerPropertiesId;
	}

	public Integer getCustomerTypeId() {
		return customerTypeId;
	}

	public void setCustomerTypeId(Integer customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
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

	public Integer getOpenBankId() {
		return openBankId;
	}

	public void setOpenBankId(Integer openBankId) {
		this.openBankId = openBankId;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Integer getCustomerSourceId() {
		return customerSourceId;
	}

	public void setCustomerSourceId(Integer customerSourceId) {
		this.customerSourceId = customerSourceId;
	}

	public String getNoteInformation() {
		return noteInformation;
	}

	public void setNoteInformation(String noteInformation) {
		this.noteInformation = noteInformation;
	}

	public String execute() throws Exception {
		Customerinfo customerinfo = new Customerinfo();
		customerinfo.setCustomerName(customerName);
		
		Customerlevel customerlevel = new Customerlevel();
		customerlevel.setLevelId(levelId);
		customerinfo.setCustomerLevel(customerlevel);
		Sjzdxx sjzdxx_Properties = new Sjzdxx();
		sjzdxx_Properties.setSjzdxxId(customerPropertiesId);
		customerinfo.setDictionaryTypeInfoByCustomerProperties(sjzdxx_Properties);
		Sjzdxx sjzdxx_Type = new Sjzdxx();
		sjzdxx_Type.setSjzdxxId(customerTypeId);
		customerinfo.setDictionaryTypeInfoByCustomerType(sjzdxx_Type);
		Sjzdxx sjzdxx_Bank = new Sjzdxx();
		sjzdxx_Bank.setSjzdxxId(openBankId);
		customerinfo.setDictionaryTypeInfoByOpenBank(sjzdxx_Bank);
		Sjzdxx sjzdxx_Source = new Sjzdxx();
		sjzdxx_Source.setSjzdxxId(customerSourceId);
		customerinfo.setDictionaryTypeInfoByCustomerSource(sjzdxx_Source);
		customerinfo.setCustomerCompanyWebsize(customerCompanyWebsize);
		customerinfo.setCustomerCompanyPhone(customerCompanyPhone);
		customerinfo.setRegister(register);
		customerinfo.setCustomerAddress(customerAddress);
		customerinfo.setCustomerProvinces(customerProvinces);
		customerinfo.setCustomerCity(customerCity);
		customerinfo.setCustomerCode(customerCode);
		customerinfo.setBankAccount(bankAccount);
		customerinfo.setNoteInformation(noteInformation);
		if (customerinfoService.findCustomerinfoByCustomerInfoName(customerName) == null) {
			customerinfoService.updateCustomerInfo(customerinfo);
		}else {
			ServletActionContext.getRequest().setAttribute("error","该名称已被注册");
		}
		return this.SUCCESS;
	}
}
