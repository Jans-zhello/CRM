package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Customerlevel;
import com.zzz.hibernate.util.CustomerlevelDAO;

public class CustomerlevelServiceImpl implements CustomerlevelService {

	private CustomerlevelDAO customerlevelDAO;

	public CustomerlevelDAO getCustomerlevelDAO() {
		return customerlevelDAO;
	}

	public void setCustomerlevelDAO(CustomerlevelDAO customerlevelDAO) {
		this.customerlevelDAO = customerlevelDAO;
	}

	@Override
	public List<Customerlevel> getAllCustomerlevels() {
		// TODO Auto-generated method stub
		return customerlevelDAO.findAll();
	}

	@Override
	public void updateCustomerlevel(Customerlevel customerlevel) {
		customerlevelDAO.attachDirty(customerlevel);
	}

}
