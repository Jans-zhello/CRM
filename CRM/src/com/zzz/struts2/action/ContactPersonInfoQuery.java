package com.zzz.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Contactpersoninfo;
import com.zzz.page.Page;
import com.zzz.page.Result;
import com.zzz.struts2.service.ContactpersoninfoService;

public class ContactPersonInfoQuery extends ActionSupport {

	private String type;
	private String key;
	private Integer currentPage;
	private ContactpersoninfoService contactpersoninfoService;

	
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public ContactpersoninfoService getContactpersoninfoService() {
		return contactpersoninfoService;
	}

	public void setContactpersoninfoService(
			ContactpersoninfoService contactpersoninfoService) {
		this.contactpersoninfoService = contactpersoninfoService;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String execute() throws Exception {
		Page page = new Page();
		page.setCurrentPage(currentPage);
		page.setEveryPage(2);
        Result result = contactpersoninfoService.queryAllContactpersoninfos(type, key,page);
		HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("findAllContactPersonInfo", result.getList());
		request.setAttribute(type, "selected");
		request.setAttribute("key",key);
		request.setAttribute("page",result.getPage());
        return this.SUCCESS;
	}
}
