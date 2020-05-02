package com.zzz.hibernate.util;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.mail.util.QEncoderStream;
import com.zzz.page.Page;

/**
 * A data access object (DAO) providing persistence and search support for
 * Contactpersoninfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zzz.hibernate.util.Contactpersoninfo
 * @author MyEclipse Persistence Tools
 */
public class ContactpersoninfoDAOImpl extends HibernateDaoSupport implements ContactpersoninfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ContactpersoninfoDAOImpl.class);
	@Override
	public void save(Contactpersoninfo transientInstance) {
		log.debug("saving Contactpersoninfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	@Override
	public void delete(Contactpersoninfo persistentInstance) {
		log.debug("deleting Contactpersoninfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	@Override
	public Contactpersoninfo findById(java.lang.Integer id) {
		log.debug("getting Contactpersoninfo instance with id: " + id);
		try {
			Contactpersoninfo instance = (Contactpersoninfo) getSession().get(
					"com.zzz.hibernate.util.Contactpersoninfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public List findByExample(Contactpersoninfo instance) {
		log.debug("finding Contactpersoninfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.zzz.hibernate.util.Contactpersoninfo")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Contactpersoninfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Contactpersoninfo as model where model."
					+ propertyName + " like ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, "%"+value+"%");
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	@Override
	public int findByPropertyCount(String propertyName, Object value) {
		log.debug("finding Contactpersoninfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Contactpersoninfo as model where model."
					+ propertyName + " like ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, "%"+value+"%");
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	@Override
	public List findByProperty(String propertyName, Object value,Page page) {
		log.debug("finding Contactpersoninfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Contactpersoninfo as model where model."
					+ propertyName + " like ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, "%"+value+"%");
			queryObject.setFirstResult(page.getBeginIndex());
			queryObject.setMaxResults(page.getEveryPage());
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findByContactName(java.lang.Object)
	 */
	@Override
	public List findByContactName(Object contactName) {
		return findByProperty(CONTACT_NAME, contactName);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findByContactSex(java.lang.Object)
	 */
	@Override
	public List findByContactSex(Object contactSex) {
		return findByProperty(CONTACT_SEX, contactSex);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findByContactPost(java.lang.Object)
	 */
	@Override
	public List findByContactPost(Object contactPost) {
		return findByProperty(CONTACT_POST, contactPost);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findByContactOfficePhone(java.lang.Object)
	 */
	@Override
	public List findByContactOfficePhone(Object contactOfficePhone) {
		return findByProperty(CONTACT_OFFICE_PHONE, contactOfficePhone);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findByContactMobilePhone(java.lang.Object)
	 */
	@Override
	public List findByContactMobilePhone(Object contactMobilePhone) {
		return findByProperty(CONTACT_MOBILE_PHONE, contactMobilePhone);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findByContactEmail(java.lang.Object)
	 */
	@Override
	public List findByContactEmail(Object contactEmail) {
		return findByProperty(CONTACT_EMAIL, contactEmail);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findByContactQqnumber(java.lang.Object)
	 */
	@Override
	public List findByContactQqnumber(Object contactQqnumber) {
		return findByProperty(CONTACT_QQNUMBER, contactQqnumber);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findByContactRemarks(java.lang.Object)
	 */
	@Override
	public List findByContactRemarks(Object contactRemarks) {
		return findByProperty(CONTACT_REMARKS, contactRemarks);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.ContactpersoninfoDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Contactpersoninfo instances");
		try {
			String queryString = "from Contactpersoninfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	@Override
	public int queryAllCount() {
		log.debug("finding all Contactpersoninfo instances");
		try {
			String queryString = "from Contactpersoninfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	@Override
	public List findAll(Page page) {
		log.debug("finding all Contactpersoninfo instances");
		try {
			String queryString = "from Contactpersoninfo";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(page.getBeginIndex());
			queryObject.setMaxResults(page.getEveryPage());
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	

	@Override
	public Contactpersoninfo merge(Contactpersoninfo detachedInstance) {
		log.debug("merging Contactpersoninfo instance");
		try {
			Contactpersoninfo result = (Contactpersoninfo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	@Override
	public void attachDirty(Contactpersoninfo instance) {
		log.debug("attaching dirty Contactpersoninfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@Override
	public void attachClean(Contactpersoninfo instance) {
		log.debug("attaching clean Contactpersoninfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}