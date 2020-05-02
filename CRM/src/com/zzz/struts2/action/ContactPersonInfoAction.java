package com.zzz.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Contactpersoninfo;
import com.zzz.page.Page;
import com.zzz.page.Result;
import com.zzz.struts2.service.ContactpersoninfoService;

public class ContactPersonInfoAction extends ActionSupport {

	private ContactpersoninfoService contactpersoninfoService;
	private Integer currentPage; 

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

	public String execute() throws Exception {
		Page page = new Page();
		page.setCurrentPage(currentPage);
		page.setEveryPage(2);
        Result result = contactpersoninfoService.getAllContactpersoninfos(page);
        HttpServletRequest request = ServletActionContext.getRequest();  
        request.setAttribute("findAllContactPersonInfo",result.getList());        
		request.setAttribute("page", result.getPage());
        return this.SUCCESS;
	}
}
