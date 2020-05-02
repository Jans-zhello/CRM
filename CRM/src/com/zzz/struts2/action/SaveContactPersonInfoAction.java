package com.zzz.struts2.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Contactpersoninfo;
import com.zzz.hibernate.util.Customerinfo;
import com.zzz.struts2.service.ContactpersoninfoService;

public class SaveContactPersonInfoAction extends ActionSupport {
	private Integer contactId;
	private Integer customerId;
	private String contactName;
	private String contactPost;
	private String customerName;
	private String contactQQNumber;
	private Date contactBirthday;
	private String contactSex;
	private String contactMobilePhone;
	private String contactOfficePhone;
	private String contactEmail;
	private Date contactRegistDate;
	private String contactRemarks;
	
	private ContactpersoninfoService contactpersoninfoService;

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPost() {
		return contactPost;
	}

	public void setContactPost(String contactPost) {
		this.contactPost = contactPost;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactQQNumber() {
		return contactQQNumber;
	}

	public void setContactQQNumber(String contactQQNumber) {
		this.contactQQNumber = contactQQNumber;
	}

	public Date getContactBirthday() {
		return contactBirthday;
	}

	public void setContactBirthday(Date contactBirthday) {
		this.contactBirthday = contactBirthday;
	}

	public String getContactSex() {
		return contactSex;
	}

	public void setContactSex(String contactSex) {
		this.contactSex = contactSex;
	}

	public String getContactMobilePhone() {
		return contactMobilePhone;
	}

	public void setContactMobilePhone(String contactMobilePhone) {
		this.contactMobilePhone = contactMobilePhone;
	}

	public String getContactOfficePhone() {
		return contactOfficePhone;
	}

	public void setContactOfficePhone(String contactOfficePhone) {
		this.contactOfficePhone = contactOfficePhone;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Date getContactRegistDate() {
		return contactRegistDate;
	}

	public void setContactRegistDate(Date contactRegistDate) {
		this.contactRegistDate = contactRegistDate;
	}

	public String getContactRemarks() {
		return contactRemarks;
	}

	public void setContactRemarks(String contactRemarks) {
		this.contactRemarks = contactRemarks;
	}

	public ContactpersoninfoService getContactpersoninfoService() {
		return contactpersoninfoService;
	}

	public void setContactpersoninfoService(
			ContactpersoninfoService contactpersoninfoService) {
		this.contactpersoninfoService = contactpersoninfoService;
	}
	
	public String execute() throws Exception {
		Contactpersoninfo contactPersonInfo=new Contactpersoninfo();
		Customerinfo customerInfo =new Customerinfo();
		customerInfo.setCustomerId(customerId);
		contactPersonInfo.setCustomerinfo(customerInfo);
		contactPersonInfo.setContactBirthday(contactBirthday);
		contactPersonInfo.setContactEmail(contactEmail);
		contactPersonInfo.setContactMobilePhone(contactMobilePhone);
		contactPersonInfo.setContactName(contactName);
		contactPersonInfo.setContactPost(contactPost);
		contactPersonInfo.setContactOfficePhone(contactOfficePhone);
		contactPersonInfo.setContactQqnumber(contactQQNumber);
		contactPersonInfo.setContactRegistDate(contactRegistDate);
		contactPersonInfo.setContactRemarks(contactRemarks);
		contactPersonInfo.setContactSex(contactSex);
		contactpersoninfoService.saveContactpersoninfo(contactPersonInfo);
		
		return this.SUCCESS;
	}
	
}
