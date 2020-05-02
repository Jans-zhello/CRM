package com.zzz.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Customerinfo;
import com.zzz.struts2.service.CustomerinfoService;

public class CustomerInfoDetailAction extends ActionSupport {

	private Integer customerinfoId;
	private CustomerinfoService customerinfoService;

	public Integer getCustomerinfoId() {
		return customerinfoId;
	}

	public void setCustomerinfoId(Integer customerinfoId) {
		this.customerinfoId = customerinfoId;
	}

	public CustomerinfoService getCustomerinfoService() {
		return customerinfoService;
	}

	public void setCustomerinfoService(CustomerinfoService customerinfoService) {
		this.customerinfoService = customerinfoService;
	}

	@Override
	public String execute() throws Exception {
		Customerinfo customerinfo = customerinfoService.findCustomerinfoById(customerinfoId);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("customerInfo", customerinfo);
		return this.SUCCESS;
	}
}
