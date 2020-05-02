package com.zzz.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Sjzdxx;
import com.zzz.struts2.service.SjzdflService;
import com.zzz.struts2.service.SjzdxxService;

public class UpdatesjzdxxAction extends ActionSupport {
	private Integer sjzdflId;
	private Integer[] sjzdxxIds;
	private String[] checks;
	private String[] sjzdxxmcs;
	private SjzdflService sjzdflService;
	private SjzdxxService sjzdxxService;

	public Integer getSjzdflId() {
		return sjzdflId;
	}

	public void setSjzdflId(Integer sjzdflId) {
		this.sjzdflId = sjzdflId;
	}

	public Integer[] getSjzdxxIds() {
		return sjzdxxIds;
	}

	public void setSjzdxxIds(Integer[] sjzdxxIds) {
		this.sjzdxxIds = sjzdxxIds;
	}

	public String[] getChecks() {
		return checks;
	}

	public void setChecks(String[] checks) {
		this.checks = checks;
	}

	public String[] getSjzdxxmcs() {
		return sjzdxxmcs;
	}

	public void setSjzdxxmcs(String[] sjzdxxmcs) {
		this.sjzdxxmcs = sjzdxxmcs;
	}

	public SjzdflService getSjzdflService() {
		return sjzdflService;
	}

	public void setSjzdflService(SjzdflService sjzdflService) {
		this.sjzdflService = sjzdflService;
	}

	public SjzdxxService getSjzdxxService() {
		return sjzdxxService;
	}

	public void setSjzdxxService(SjzdxxService sjzdxxService) {
		this.sjzdxxService = sjzdxxService;
	}
   
	@Override
	public String execute() throws Exception {
		for (int i=0;i<sjzdxxIds.length;i++) {
			Sjzdxx sjzdxx = new Sjzdxx();
			sjzdxx.setSjzdxxId(sjzdxxIds[i]);
			sjzdxx.setSjzdfl(sjzdflService.getSjzdflBySjzdflId(sjzdflId));
			sjzdxx.setSjzdxxmc(sjzdxxmcs[i]);
			sjzdxx.setEnable("no");
			if (checks != null && checks.length>0) {
				for (String enable:checks) {
					if (enable.equals("qiyong"+sjzdxx.getSjzdxxId())) {
						sjzdxx.setEnable("yes");
						break;
					}
				}				
			}
			sjzdxxService.updateSjzdxx(sjzdxx);
		}
		
		return this.SUCCESS;
	}
}
