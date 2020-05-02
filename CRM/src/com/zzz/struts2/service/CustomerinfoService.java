package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Customerinfo;
import com.zzz.hibernate.util.Customerlevel;
import com.zzz.hibernate.util.Sjzdxx;
import com.zzz.page.Page;
import com.zzz.page.Result;

public interface CustomerinfoService {
     public List<Sjzdxx> getAllCustomerProperties();
     public List<Sjzdxx> getAllCustomerTypes();
     public List<Customerlevel> getAllCustomerLevels();
     public List<Sjzdxx> getAllOpenBanks();
     public List<Sjzdxx> getAllCustomerSource();
     public void updateCustomerInfo(Customerinfo customerinfo);
     public Customerinfo findCustomerinfoByCustomerInfoName(String CustomerInfoName);
     public List<Customerinfo> getAllCustomerinfos();
     public Result getAllCustomerinfos(Page page);
     public Customerinfo findCustomerinfoById(Integer customerinfoId);
     public Result getQueryCustomerinfos(String propertyName,Object value,Page page);
}
