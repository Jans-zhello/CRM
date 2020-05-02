package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Contactpersoninfo;
import com.zzz.hibernate.util.ContactpersoninfoDAO;
import com.zzz.page.Page;
import com.zzz.page.PageUtil;
import com.zzz.page.Result;

public class ContactpersoninfoServiceImpl implements ContactpersoninfoService {

	private ContactpersoninfoDAO contactpersoninfoDAO;

	public ContactpersoninfoDAO getContactpersoninfoDAO() {
		return contactpersoninfoDAO;
	}

	public void setContactpersoninfoDAO(
			ContactpersoninfoDAO contactpersoninfoDAO) {
		this.contactpersoninfoDAO = contactpersoninfoDAO;
	}

	@Override
	public void saveContactpersoninfo(Contactpersoninfo contactpersoninfo) {
		contactpersoninfoDAO.attachDirty(contactpersoninfo);
	}

	@Override
	public List<Contactpersoninfo> getAllContactpersoninfos() {
		return contactpersoninfoDAO.findAll();
	}

	@Override
	public Result getAllContactpersoninfos(Page page) {
		// TODO Auto-generated method stub
		page = PageUtil.createPage(page, contactpersoninfoDAO.queryAllCount());
		List<Contactpersoninfo> findAll = contactpersoninfoDAO.findAll(page);
		Result result = new Result();
		result.setList(findAll);
		result.setPage(page);
		return result;
	}

	@Override
	public Result queryAllContactpersoninfos(String type, String key, Page page) {
		page = PageUtil.createPage(page, contactpersoninfoDAO.findByPropertyCount(type, key));
        List<Contactpersoninfo> lists = contactpersoninfoDAO.findByProperty(type, key, page);		
		Result result = new Result();
		result.setList(lists);
		result.setPage(page);
        return result;
	}

	@Override
	public Contactpersoninfo findById(Integer contactpersonId) {
		return contactpersoninfoDAO.findById(contactpersonId);
	}

	@Override
	public void deleteById(Integer id) {
		contactpersoninfoDAO.delete(findById(id));
	}
}
