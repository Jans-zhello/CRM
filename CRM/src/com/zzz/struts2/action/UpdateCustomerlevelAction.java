package com.zzz.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Customerlevel;
import com.zzz.struts2.service.CustomerlevelService;

public class UpdateCustomerlevelAction extends ActionSupport {
	private Integer[] levelId;
	private Double[] business;
	private String[] levelName;
	private CustomerlevelService customerlevelService;

	public Integer[] getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer[] levelId) {
		this.levelId = levelId;
	}

	public Double[] getBusiness() {
		return business;
	}

	public void setBusiness(Double[] business) {
		this.business = business;
	}

	public String[] getLevelName() {
		return levelName;
	}

	public void setLevelName(String[] levelName) {
		this.levelName = levelName;
	}

	public CustomerlevelService getCustomerlevelService() {
		return customerlevelService;
	}

	public void setCustomerlevelService(
			CustomerlevelService customerlevelService) {
		this.customerlevelService = customerlevelService;
	}  
  	@Override
  	public String execute() throws Exception {
  		for (int i = 0; i < levelId.length; i++) {
			Customerlevel customerlevel = new Customerlevel();
			customerlevel.setLevelId(levelId[i]);
			customerlevel.setBusiness(business[i]);
			customerlevel.setLevelName(levelName[i]);
			customerlevelService.updateCustomerlevel(customerlevel);
		}
  		return this.SUCCESS;
  	}
}
