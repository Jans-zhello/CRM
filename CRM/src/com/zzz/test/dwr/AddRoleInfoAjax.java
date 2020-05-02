package com.zzz.test.dwr;

import com.zzz.hibernate.util.Menuinfo;
import com.zzz.hibernate.util.Roleinfo;
import com.zzz.hibernate.util.Rolerelationship;
import com.zzz.struts2.service.RoleInfoService;
import com.zzz.struts2.service.RoleRelationShipService;

public class AddRoleInfoAjax {
	private RoleInfoService roleInfoService;
	private RoleRelationShipService roleRelationShipService;
	public RoleInfoService getRoleInfoService() {
		return roleInfoService;
	}
	public void setRoleInfoService(RoleInfoService roleInfoService) {
		this.roleInfoService = roleInfoService;
	}
	public RoleRelationShipService getRoleRelationShipService() {
		return roleRelationShipService;
	}
	public void setRoleRelationShipService(
			RoleRelationShipService roleRelationShipService) {
		this.roleRelationShipService = roleRelationShipService;
	}
	
	public String saveRoleInfo(String rolename,Integer[] menuids){
		Roleinfo roleinfo = new Roleinfo();
		roleinfo.setRoleName(rolename);
		roleInfoService.saveRoleInfo(roleinfo);
        for (int i = 0; i < 7; i++) {
			Rolerelationship rolerelationship = new Rolerelationship();
			rolerelationship.setRoleinfo(roleinfo);
			Menuinfo menuinfo = new Menuinfo();
			menuinfo.setMenuInfoId(i+1);
			rolerelationship.setMenuinfo(menuinfo);
			rolerelationship.setAccess(0);
			for (int j = 0; j < menuids.length; j++) {
				if ((i+1) == menuids[j]) {
					rolerelationship.setAccess(1);
					break;
				}
			}
			roleRelationShipService.save(rolerelationship);
		}		
		return "添加角色成功";
	}
	
}
