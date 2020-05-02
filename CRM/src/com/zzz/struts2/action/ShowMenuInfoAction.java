package com.zzz.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Menuinfo;
import com.zzz.struts2.service.MenuInfoService;

public class ShowMenuInfoAction extends ActionSupport {
	private MenuInfoService menuInfoService;
	
	

	public MenuInfoService getMenuInfoService() {
		return menuInfoService;
	}



	public void setMenuInfoService(MenuInfoService menuInfoService) {
		this.menuInfoService = menuInfoService;
	}



	public String execute() throws Exception {
		List<Menuinfo> menuInfoFindAll = menuInfoService.findAllMenuinfos();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("menuInfoFindAll", menuInfoFindAll);
		return this.SUCCESS;
	}

}
