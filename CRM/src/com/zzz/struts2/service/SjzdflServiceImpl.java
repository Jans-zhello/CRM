package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Sjzdfl;
import com.zzz.hibernate.util.SjzdflDAO;

public class SjzdflServiceImpl implements SjzdflService {
	private SjzdflDAO sjzdflDAO;

	public SjzdflDAO getSjzdflDAO() {
		return sjzdflDAO;
	}

	public void setSjzdflDAO(SjzdflDAO sjzdflDAO) {
		this.sjzdflDAO = sjzdflDAO;
	}

	@Override
	public List<Sjzdfl> getAllSjzdfl() {
		return sjzdflDAO.findAll();
	}

	@Override
	public void updateSjzdfl(Sjzdfl sjzdfl) {
		sjzdflDAO.attachDirty(sjzdfl);
	}

	@Override
	public Sjzdfl getSjzdflBySjzdflId(int sjzdflId) {
		return (Sjzdfl) sjzdflDAO.findByProperty("sjzdflId", sjzdflId).get(0);
	}
}
