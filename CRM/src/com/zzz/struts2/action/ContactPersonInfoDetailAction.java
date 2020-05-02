package com.zzz.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Contactpersoninfo;
import com.zzz.struts2.service.ContactpersoninfoService;

public class ContactPersonInfoDetailAction extends ActionSupport {
	private ContactpersoninfoService contactpersoninfoService;
	private Integer contactpersoninfoId;

	public Integer getContactpersoninfoId() {
		return contactpersoninfoId;
	}

	public void setContactpersoninfoId(Integer contactpersoninfoId) {
		this.contactpersoninfoId = contactpersoninfoId;
	}

	public ContactpersoninfoService getContactpersoninfoService() {
		return contactpersoninfoService;
	}

	public void setContactpersoninfoService(
			ContactpersoninfoService contactpersoninfoService) {
		this.contactpersoninfoService = contactpersoninfoService;
	}

	@Override
	public String execute() throws Exception {
		Contactpersoninfo contactpersoninfo = contactpersoninfoService.findById(contactpersoninfoId);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("contactpersoninfo", contactpersoninfo);
		return this.SUCCESS;
	}
}
