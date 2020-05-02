package com.zzz.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Sjzdfl;
import com.zzz.hibernate.util.Sjzdxx;
import com.zzz.struts2.service.SjzdflService;
import com.zzz.struts2.service.SjzdxxService;

public class SjzdxxAction extends ActionSupport {
	private Integer sjzdflId;
	private SjzdflService sjzdflService;
	private SjzdxxService sjzdxxService;

	public Integer getSjzdflId() {
		return sjzdflId;
	}

	public void setSjzdflId(Integer sjzdflId) {
		this.sjzdflId = sjzdflId;
	}

	public SjzdxxService getSjzdxxService() {
		return sjzdxxService;
	}

	public void setSjzdxxService(SjzdxxService sjzdxxService) {
		this.sjzdxxService = sjzdxxService;
	}

	public SjzdflService getSjzdflService() {
		return sjzdflService;
	}

	public void setSjzdflService(SjzdflService sjzdflService) {
		this.sjzdflService = sjzdflService;
	}
    
	@Override
	public String execute() throws Exception {
		     //根据sjzdflId查询sjzdfl实例
		     Sjzdfl sjzdfl = sjzdflService.getSjzdflBySjzdflId(sjzdflId);
             HttpServletRequest request = ServletActionContext.getRequest();		     
		     request.setAttribute("sjzdflmc",sjzdfl.getSjzdflmc());
		     List<Sjzdxx> allsjzdxx = sjzdxxService.getAllSjzdxxBySjzdfl(sjzdfl);
		     request.setAttribute("allsjzdxx", allsjzdxx);
			 return this.SUCCESS;
	}
}
