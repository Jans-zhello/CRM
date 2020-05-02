package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Sjzdfl;
import com.zzz.hibernate.util.Sjzdxx;

public interface SjzdxxService {
   public List<Sjzdxx> getAllSjzdxxBySjzdfl(Sjzdfl sjzdfl);
   public void updateSjzdxx(Sjzdxx sjzdxx);
}
