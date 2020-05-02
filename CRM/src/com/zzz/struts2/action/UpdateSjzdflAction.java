package com.zzz.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zzz.hibernate.util.Sjzdfl;
import com.zzz.struts2.service.SjzdflService;

public class UpdateSjzdflAction extends ActionSupport {
	private Integer[] sjzdflIds;
	private String[] sjzdflmcs;
	private String[] checks;
    private SjzdflService sjzdflService;
    
	public SjzdflService getSjzdflService() {
		return sjzdflService;
	}

	public void setSjzdflService(SjzdflService sjzdflService) {
		this.sjzdflService = sjzdflService;
	}
	
	public String[] getChecks() {
		return checks;
	}

	public void setChecks(String[] checks) {
		this.checks = checks;
	}

	public Integer[] getSjzdflIds() {
		return sjzdflIds;
	}

	public void setSjzdflIds(Integer[] sjzdflIds) {
		this.sjzdflIds = sjzdflIds;
	}

	public String[] getSjzdflmcs() {
		return sjzdflmcs;
	}

	public void setSjzdflmcs(String[] sjzdflmcs) {
		this.sjzdflmcs = sjzdflmcs;
	}
	@Override
	public String execute() throws Exception {
		for (int i=0;i<sjzdflIds.length;i++) {
			Sjzdfl sjzdfl = new Sjzdfl();
			sjzdfl.setSjzdflId(sjzdflIds[i]);
			sjzdfl.setSjzdflmc(sjzdflmcs[i]);
			sjzdfl.setEnable("no");
			if (checks != null && checks.length>0) {
				 for (String check:checks) {
					if (check.equals("qiyong"+sjzdfl.getSjzdflId())) {
						sjzdfl.setEnable("yes");
						break;
					}
				}
			}
			sjzdflService.updateSjzdfl(sjzdfl);
		}
		return this.SUCCESS;
	}

}
