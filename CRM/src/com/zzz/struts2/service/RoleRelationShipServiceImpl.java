package com.zzz.struts2.service;

import com.zzz.hibernate.util.Rolerelationship;
import com.zzz.hibernate.util.RolerelationshipDAO;

public class RoleRelationShipServiceImpl implements RoleRelationShipService{

    private RolerelationshipDAO rolerelationshipDAO;
    
	public RolerelationshipDAO getRolerelationshipDAO() {
		return rolerelationshipDAO;
	}

	public void setRolerelationshipDAO(RolerelationshipDAO rolerelationshipDAO) {
		this.rolerelationshipDAO = rolerelationshipDAO;
	}

	@Override
	public void save(Rolerelationship rolerelationship) {
		 rolerelationshipDAO.save(rolerelationship);
	}
}
