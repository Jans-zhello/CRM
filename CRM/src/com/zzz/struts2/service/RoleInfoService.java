package com.zzz.struts2.service;

import com.zzz.hibernate.util.Roleinfo;
import com.zzz.page.Page;
import com.zzz.page.Result;

public interface RoleInfoService {
   public void saveRoleInfo(Roleinfo roleinfo); 
   
   public Result findAllRoles(Page page);
} 
