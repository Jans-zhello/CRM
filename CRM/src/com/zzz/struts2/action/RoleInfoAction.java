package com.zzz.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.page.Page;
import com.zzz.page.Result;
import com.zzz.struts2.service.RoleInfoService;

public class RoleInfoAction extends ActionSupport {
	private RoleInfoService roleInfoService;
    private Integer currentPage;
    
	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public RoleInfoService getRoleInfoService() {
		return roleInfoService;
	}

	public void setRoleInfoService(RoleInfoService roleInfoService) {
		this.roleInfoService = roleInfoService;
	}
	
	@Override
	public String execute() throws Exception {
		Page page = new Page();
		page.setCurrentPage(currentPage);
		page.setEveryPage(2);
		Result result = roleInfoService.findAllRoles(page);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("findAllRoleInfo",result.getList());
		request.setAttribute("page",result.getPage());
		return this.SUCCESS;
	}

}
