package com.zzz.test.dwr;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.zzz.hibernate.util.Contactpersoninfo;
import com.zzz.struts2.service.ContactpersoninfoService;

public class ContactPersonInfoDetailAjax {
	private ContactpersoninfoService contactpersoninfoService;

	public ContactpersoninfoService getContactpersoninfoService() {
		return contactpersoninfoService;
	}

	public void setContactpersoninfoService(
			ContactpersoninfoService contactpersoninfoService) {
		this.contactpersoninfoService = contactpersoninfoService;
	}

	public String findContactpersoninfoById(
			Integer contactpersoninfoId) {
		Contactpersoninfo contactpersoninfo = contactpersoninfoService.findById(contactpersoninfoId);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("contactpersoninfo", contactpersoninfo);
		return "";
	}
}
