package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Customerinfo;
import com.zzz.hibernate.util.CustomerinfoDAO;
import com.zzz.hibernate.util.Customerlevel;
import com.zzz.hibernate.util.CustomerlevelDAO;
import com.zzz.hibernate.util.Sjzdfl;
import com.zzz.hibernate.util.SjzdflDAO;
import com.zzz.hibernate.util.Sjzdxx;
import com.zzz.hibernate.util.SjzdxxDAO;
import com.zzz.page.Page;
import com.zzz.page.PageUtil;
import com.zzz.page.Result;

public class CustomerinfoServiceImpl implements CustomerinfoService {
   
	private CustomerlevelDAO customerlevelDAO;
	private SjzdxxDAO sjzdxxDAO;
	private SjzdflDAO sjzdflDAO;
	private CustomerinfoDAO customerinfoDAO;
	
	
	public CustomerinfoDAO getCustomerinfoDAO() {
		return customerinfoDAO;
	}

	public void setCustomerinfoDAO(CustomerinfoDAO customerinfoDAO) {
		this.customerinfoDAO = customerinfoDAO;
	}

	public CustomerlevelDAO getCustomerlevelDAO() {
		return customerlevelDAO;
	}

	public void setCustomerlevelDAO(CustomerlevelDAO customerlevelDAO) {
		this.customerlevelDAO = customerlevelDAO;
	}

	public SjzdxxDAO getSjzdxxDAO() {
		return sjzdxxDAO;
	}

	public void setSjzdxxDAO(SjzdxxDAO sjzdxxDAO) {
		this.sjzdxxDAO = sjzdxxDAO;
	}

	public SjzdflDAO getSjzdflDAO() {
		return sjzdflDAO;
	}

	public void setSjzdflDAO(SjzdflDAO sjzdflDAO) {
		this.sjzdflDAO = sjzdflDAO;
	}

	@Override
	public List<Sjzdxx> getAllCustomerProperties() {
		Sjzdfl sjzdfl = (Sjzdfl) sjzdflDAO.findBySjzdflmc("企业性质-分类").get(0);
		return sjzdxxDAO.findByProperty("sjzdfl",sjzdfl);
	}

	@Override
	public List<Sjzdxx> getAllCustomerTypes() {
		Sjzdfl sjzdfl = (Sjzdfl) sjzdflDAO.findBySjzdflmc("企业类型-分类").get(0);
		return sjzdxxDAO.findByProperty("sjzdfl",sjzdfl);
	}

	@Override
	public List<Customerlevel> getAllCustomerLevels() {
		// TODO Auto-generated method stub
		return customerlevelDAO.findAll();
	}

	@Override
	public List<Sjzdxx> getAllOpenBanks() {
		Sjzdfl sjzdfl = (Sjzdfl) sjzdflDAO.findBySjzdflmc("开户银行-分类").get(0);
		return sjzdxxDAO.findByProperty("sjzdfl",sjzdfl);
	}

	@Override
	public List<Sjzdxx> getAllCustomerSource() {
		Sjzdfl sjzdfl = (Sjzdfl) sjzdflDAO.findBySjzdflmc("信息来源-分类").get(0);
		return sjzdxxDAO.findByProperty("sjzdfl",sjzdfl);
	}

	@Override
	public void updateCustomerInfo(Customerinfo customerinfo) {
            customerinfoDAO.attachDirty(customerinfo);	
	}

	@Override
	public Customerinfo findCustomerinfoByCustomerInfoName(String CustomerInfoName) {
		List<Customerinfo> customerinfolist = customerinfoDAO.findByCustomerName(CustomerInfoName);
		if (customerinfolist!=null && customerinfolist.size()>0) {
			return customerinfolist.get(0);
		}
		return null;
	}

	@Override
	public List<Customerinfo> getAllCustomerinfos() {
		return customerinfoDAO.findAll();
	}

	@Override
	public Result getAllCustomerinfos(Page page) {
		page = PageUtil.createPage(page, customerinfoDAO.findAllCount());
		List<Customerinfo> customerinfos = customerinfoDAO.findAll(page);
		Result result = new Result();
		result.setList(customerinfos);
		result.setPage(page);
		return result;
	}

	@Override
	public Customerinfo findCustomerinfoById(Integer customerinfoId) {
		return customerinfoDAO.findById(customerinfoId);
	}

	@Override
	public Result getQueryCustomerinfos(String propertyName,Object value,Page page) {
		page = PageUtil.createPage(page, customerinfoDAO.findByPropertyCount(propertyName, value));
		List<Customerinfo> customerinfos = customerinfoDAO.findByProperty(propertyName, value,page);
		Result result = new Result();
		result.setList(customerinfos);
		result.setPage(page);
		return result;	
	}
}
