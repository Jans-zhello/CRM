package com.zzz.hibernate.util;

import java.util.Date;

public class Contactpersoninfo extends AbstractContactpersoninfo {
   
	public Contactpersoninfo(){}

	public Contactpersoninfo(Customerinfo customerinfo, String contactName,
			String contactSex, Date contactBirthday, String contactPost,
			String contactOfficePhone, String contactMobilePhone,
			String contactEmail, Date contactRegistDate,
			String contactQqnumber, String contactRemarks) {
		super(customerinfo, contactName, contactSex, contactBirthday, contactPost,
				contactOfficePhone, contactMobilePhone, contactEmail,
				contactRegistDate, contactQqnumber, contactRemarks);
		// TODO Auto-generated constructor stub
	}
	
}  
