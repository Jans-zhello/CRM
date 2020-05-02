package com.zzz.struts2.service;

import java.util.List;

import com.zzz.hibernate.util.Contactpersoninfo;
import com.zzz.page.Page;
import com.zzz.page.Result;

public interface ContactpersoninfoService {
    public void saveContactpersoninfo(Contactpersoninfo contactpersoninfo);
    public List<Contactpersoninfo> getAllContactpersoninfos();
    public Result getAllContactpersoninfos(Page page);
    public Result queryAllContactpersoninfos(String type,String key,Page page);
    public Contactpersoninfo findById(Integer contactpersonId);
    public void deleteById(Integer id);
}
