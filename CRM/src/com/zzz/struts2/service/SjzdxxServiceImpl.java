package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Sjzdfl;
import com.zzz.hibernate.util.Sjzdxx;
import com.zzz.hibernate.util.SjzdxxDAO;

public class SjzdxxServiceImpl implements SjzdxxService {
   
	private SjzdxxDAO sjzdxxDAO;
	
	public SjzdxxDAO getSjzdxxDAO() {
		return sjzdxxDAO;
	}

	public void setSjzdxxDAO(SjzdxxDAO sjzdxxDAO) {
		this.sjzdxxDAO = sjzdxxDAO;
	}

	@Override
	public List<Sjzdxx> getAllSjzdxxBySjzdfl(Sjzdfl sjzdfl) {
		return sjzdxxDAO.findByProperty("sjzdfl", sjzdfl);
	}

	@Override
	public void updateSjzdxx(Sjzdxx sjzdxx) {
		sjzdxxDAO.attachDirty(sjzdxx);
	}
}
