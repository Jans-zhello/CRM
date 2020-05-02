package com.zzz.test.hibernateAndExcel;

import java.util.List;

import com.zzz.hibernate.util.Sjzdxx;
import com.zzz.hibernate.util.SjzdxxDAO;
import com.zzz.hibernate.util.SjzdxxDAOImpl;


public class HibernateTest {

	public static void main(String[] args) {
         SjzdxxDAO sDao = new SjzdxxDAOImpl();
         List<Sjzdxx> list = sDao.findAll();
         for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSjzdxxId());
		}
//		Session session = HibernateSessionFactory.getSession();
//		Transaction transaction = session.beginTransaction();
//		Sjzdfl sjzdfl = new Sjzdfl();
//		sjzdfl.setSjzdflmc("测试数据字典分类3");
//		new SjzdflDAO().save(sjzdfl);
//        transaction.commit();		
//		session.close();
	}
}
