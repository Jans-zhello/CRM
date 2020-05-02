package com.zzz.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.struts2.service.CustomerinfoService;

public class CustomerInfoAction extends ActionSupport {
	private CustomerinfoService customerinfoService;

	public CustomerinfoService getCustomerinfoService() {
		return customerinfoService;
	}

	public void setCustomerinfoService(CustomerinfoService customerinfoService) {
		this.customerinfoService = customerinfoService;
	}

	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allCustomerLevel",customerinfoService.getAllCustomerLevels());
		request.setAttribute("allCustomerProperties",customerinfoService.getAllCustomerProperties());
		request.setAttribute("allCustomerSource",customerinfoService.getAllCustomerSource());
		request.setAttribute("allCustomerType",customerinfoService.getAllCustomerTypes());
		request.setAttribute("allCustomerOpenBank",customerinfoService.getAllOpenBanks());
		return this.SUCCESS;
	}
}
