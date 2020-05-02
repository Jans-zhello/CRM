package com.zzz.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.zzz.hibernate.util.Sjzdfl;
import com.zzz.struts2.service.SjzdflService;

public class SjzdflAction extends com.opensymphony.xwork2.ActionSupport {
	private SjzdflService sjzdflService;

	public SjzdflService getSjzdflService() {
		return sjzdflService;
	}

	public void setSjzdflService(SjzdflService sjzdflService) {
		this.sjzdflService = sjzdflService;
	}
    
	@Override
	public String execute() throws Exception {
		List<Sjzdfl> allSjzdfl = sjzdflService.getAllSjzdfl();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("allSjzdfl",allSjzdfl);
		return this.SUCCESS;
	}
}
