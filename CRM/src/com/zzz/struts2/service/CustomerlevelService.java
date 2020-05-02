package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Customerlevel;

public interface CustomerlevelService {
   public List<Customerlevel> getAllCustomerlevels();
   public void updateCustomerlevel(Customerlevel customerlevel);
}
