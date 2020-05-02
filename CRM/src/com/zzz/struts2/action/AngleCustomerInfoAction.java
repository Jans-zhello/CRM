package com.zzz.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.page.Page;
import com.zzz.page.Result;
import com.zzz.struts2.service.CustomerinfoService;

public class AngleCustomerInfoAction extends ActionSupport {

	private CustomerinfoService customerinfoService;
	private Integer currentPage;
	private String everyPage;
	
	
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}


	public String getEveryPage() {
		return everyPage;
	}

	public void setEveryPage(String everyPage) {
		this.everyPage = everyPage;
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
		page.setEveryPage(Integer.parseInt(everyPage));
		Result result = customerinfoService.getAllCustomerinfos(page);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("findAllCustomerInfo", result.getList());
		request.setAttribute("page", result.getPage());
		return this.SUCCESS;
	}
}
