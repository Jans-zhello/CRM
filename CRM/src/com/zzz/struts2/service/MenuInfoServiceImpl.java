package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Menuinfo;
import com.zzz.hibernate.util.MenuinfoDAO;

public class MenuInfoServiceImpl implements MenuInfoService {

	private MenuinfoDAO menuinfoDAO;

	public MenuinfoDAO getMenuinfoDAO() {
		return menuinfoDAO;
	}

	public void setMenuinfoDAO(MenuinfoDAO menuinfoDAO) {
		this.menuinfoDAO = menuinfoDAO;
	}

	@Override
	public List<Menuinfo> findAllMenuinfos() {
		return menuinfoDAO.findAll();
	}
}
