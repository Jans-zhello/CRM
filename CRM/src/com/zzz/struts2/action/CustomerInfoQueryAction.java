package com.zzz.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.page.Page;
import com.zzz.page.Result;
import com.zzz.struts2.service.CustomerinfoService;

public class CustomerInfoQueryAction extends ActionSupport{
 
	private String type;
	private String key; 
	private Integer currentPage;
	private CustomerinfoService customerinfoService;
	
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
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

	public CustomerinfoService getCustomerinfoService() {
		return customerinfoService;
	}


	public void setCustomerinfoService(CustomerinfoService customerinfoService) {
		this.customerinfoService = customerinfoService;
	}

	@Override
	public String execute() throws Exception {
		Page page = new Page();
		page.setCurrentPage(currentPage);
		page.setEveryPage(3);
		Result result = customerinfoService.getQueryCustomerinfos(type, key, page);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("findAllCustomerInfo", result.getList());
		request.setAttribute("page", result.getPage());
		request.setAttribute(type, "selected");
		request.setAttribute("key",key);
		return this.SUCCESS;
			
	}
	
}
