package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Sjzdfl;

public interface SjzdflService {
   public List<com.zzz.hibernate.util.Sjzdfl> getAllSjzdfl();
   public void updateSjzdfl(Sjzdfl sjzdfl);
   public Sjzdfl getSjzdflBySjzdflId(int sjzdflId);
}
