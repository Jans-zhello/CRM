package com.zzz.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Customerlevel;
import com.zzz.struts2.service.CustomerlevelService;

public class CustomerlevelAction extends ActionSupport {
	private CustomerlevelService customerlevelService;

	public CustomerlevelService getCustomerlevelService() {
		return customerlevelService;
	}

	public void setCustomerlevelService(
			CustomerlevelService customerlevelService) {
		this.customerlevelService = customerlevelService;
	}

	@Override
	public String execute() throws Exception {
		List<Customerlevel> allCustomerlevel = customerlevelService
				.getAllCustomerlevels();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allCustomerlevel", allCustomerlevel);
		return this.SUCCESS;
	}
}
