package com.zzz.test.dwr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.zzz.hibernate.util.Contactpersoninfo;
import com.zzz.hibernate.util.Customerinfo;
import com.zzz.struts2.service.ContactpersoninfoService;

public class SaveContactPersonInfoAjax {

	private ContactpersoninfoService contactpersoninfoService;

	public ContactpersoninfoService getContactpersoninfoService() {
		return contactpersoninfoService;
	}

	public void setContactpersoninfoService(
			ContactpersoninfoService contactpersoninfoService) {
		this.contactpersoninfoService = contactpersoninfoService;
	}

	public String saveContactPersonInfo(Map map) throws ParseException {
		Contactpersoninfo contactPersonInfo = new Contactpersoninfo();
		Customerinfo customerInfo = new Customerinfo();
		customerInfo.setCustomerId(Integer.parseInt(map.get("customerId").toString()));
		contactPersonInfo.setCustomerinfo(customerInfo);
		contactPersonInfo.setContactBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(map.get("contactBirthday").toString()));
		contactPersonInfo.setContactEmail(map.get("contactEmail").toString());
		contactPersonInfo.setContactMobilePhone(map.get("contactMobilePhone").toString());
		contactPersonInfo.setContactPost(map.get("contactPost").toString());
		contactPersonInfo.setContactName(map.get("contactName").toString());
		contactPersonInfo.setContactOfficePhone(map.get("contactOfficePhone").toString());
		contactPersonInfo.setContactQqnumber(map.get("contactQQNumber").toString());
		contactPersonInfo.setContactRegistDate(new SimpleDateFormat("yyyy-MM-dd").parse(map.get("contactRegistDate").toString()));
		contactPersonInfo.setContactRemarks(map.get("contactRemarks").toString());
		contactPersonInfo.setContactSex(map.get("contactSex").toString());
		contactpersoninfoService.saveContactpersoninfo(contactPersonInfo);
		return "添加联系人成功!";
	}
	public String deleteById(Integer id){
		contactpersoninfoService.deleteById(id);
		return "删除成功!";
	}
	public String deleteByIds(Integer[] ids){
		for (int i = 0; i < ids.length; i++) {
			contactpersoninfoService.deleteById(ids[i]);
		}
		return "删除成功!";
	}
}
