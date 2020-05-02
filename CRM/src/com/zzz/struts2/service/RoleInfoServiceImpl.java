package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Roleinfo;
import com.zzz.hibernate.util.RoleinfoDAO;
import com.zzz.page.Page;
import com.zzz.page.PageUtil;
import com.zzz.page.Result;

public class RoleInfoServiceImpl implements RoleInfoService {

	private RoleinfoDAO roleinfoDAO;

	public RoleinfoDAO getRoleinfoDAO() {
		return roleinfoDAO;
	}

	public void setRoleinfoDAO(RoleinfoDAO roleinfoDAO) {
		this.roleinfoDAO = roleinfoDAO;
	}

	public void saveRoleInfo(Roleinfo roleinfo) {
		roleinfoDAO.save(roleinfo);
	}

	@Override
	public Result findAllRoles(Page page) {
		page = PageUtil.createPage(page, roleinfoDAO.findAllCount());
		List findAllRolesList = roleinfoDAO.findAllRolesList(page);
		Result result = new Result();
		result.setList(findAllRolesList);
		result.setPage(page);
		return result;
	}
}
