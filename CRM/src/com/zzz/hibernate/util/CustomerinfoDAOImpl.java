package com.zzz.hibernate.util;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zzz.page.Page;

/**
 * A data access object (DAO) providing persistence and search support for
 * Customerinfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zzz.hibernate.util.Customerinfo
 * @author MyEclipse Persistence Tools
 */
public class CustomerinfoDAOImpl extends HibernateDaoSupport implements CustomerinfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CustomerinfoDAOImpl.class);
	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#save(com.zzz.hibernate.util.Customerinfo)
	 */
	@Override
	public void save(Customerinfo transientInstance) {
		log.debug("saving Customerinfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#delete(com.zzz.hibernate.util.Customerinfo)
	 */
	@Override
	public void delete(Customerinfo persistentInstance) {
		log.debug("deleting Customerinfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findById(java.lang.Integer)
	 */
	@Override
	public Customerinfo findById(java.lang.Integer id) {
		log.debug("getting Customerinfo instance with id: " + id);
		try {
			Customerinfo instance = (Customerinfo) getSession().get(
					"com.zzz.hibernate.util.Customerinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByExample(com.zzz.hibernate.util.Customerinfo)
	 */
	@Override
	public List findByExample(Customerinfo instance) {
		log.debug("finding Customerinfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.zzz.hibernate.util.Customerinfo")
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
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Customerinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Customerinfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	@Override
	public List findByProperty(String propertyName, Object value,Page page) {
		log.debug("finding Customerinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Customerinfo as model where model."
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
	
	@Override
	public int findByPropertyCount(String propertyName, Object value) {
		log.debug("finding Customerinfo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Customerinfo as model where model."
					+ propertyName + " like ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, "%"+value+"%");
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerName(java.lang.Object)
	 */
	@Override
	public List findByCustomerName(Object customerName) {
		return findByProperty(CUSTOMER_NAME, customerName);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerProperties(java.lang.Object)
	 */
	@Override
	public List findByCustomerProperties(Object customerProperties) {
		return findByProperty(CUSTOMER_PROPERTIES, customerProperties);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerType(java.lang.Object)
	 */
	@Override
	public List findByCustomerType(Object customerType) {
		return findByProperty(CUSTOMER_TYPE, customerType);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerLevel(java.lang.Object)
	 */
	@Override
	public List findByCustomerLevel(Object customerLevel) {
		return findByProperty(CUSTOMER_LEVEL, customerLevel);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerCompanyWebsize(java.lang.Object)
	 */
	@Override
	public List findByCustomerCompanyWebsize(Object customerCompanyWebsize) {
		return findByProperty(CUSTOMER_COMPANY_WEBSIZE, customerCompanyWebsize);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerCompanyPhone(java.lang.Object)
	 */
	@Override
	public List findByCustomerCompanyPhone(Object customerCompanyPhone) {
		return findByProperty(CUSTOMER_COMPANY_PHONE, customerCompanyPhone);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByRegister(java.lang.Object)
	 */
	@Override
	public List findByRegister(Object register) {
		return findByProperty(REGISTER, register);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerAddress(java.lang.Object)
	 */
	@Override
	public List findByCustomerAddress(Object customerAddress) {
		return findByProperty(CUSTOMER_ADDRESS, customerAddress);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerProvinces(java.lang.Object)
	 */
	@Override
	public List findByCustomerProvinces(Object customerProvinces) {
		return findByProperty(CUSTOMER_PROVINCES, customerProvinces);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerCity(java.lang.Object)
	 */
	@Override
	public List findByCustomerCity(Object customerCity) {
		return findByProperty(CUSTOMER_CITY, customerCity);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerCode(java.lang.Object)
	 */
	@Override
	public List findByCustomerCode(Object customerCode) {
		return findByProperty(CUSTOMER_CODE, customerCode);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByOpenBank(java.lang.Object)
	 */
	@Override
	public List findByOpenBank(Object openBank) {
		return findByProperty(OPEN_BANK, openBank);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByBankAccount(java.lang.Object)
	 */
	@Override
	public List findByBankAccount(Object bankAccount) {
		return findByProperty(BANK_ACCOUNT, bankAccount);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByCustomerSource(java.lang.Object)
	 */
	@Override
	public List findByCustomerSource(Object customerSource) {
		return findByProperty(CUSTOMER_SOURCE, customerSource);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findByNoteInformation(java.lang.Object)
	 */
	@Override
	public List findByNoteInformation(Object noteInformation) {
		return findByProperty(NOTE_INFORMATION, noteInformation);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Customerinfo instances");
		try {
			String queryString = "from Customerinfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	@Override
	public List findAll(Page page) {
		log.debug("finding all Customerinfo instances");
		try {
			String queryString = "from Customerinfo";
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
	public int findAllCount() {
		log.debug("finding all Customerinfo count");
		try {
			String queryString = "from Customerinfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#merge(com.zzz.hibernate.util.Customerinfo)
	 */
	@Override
	public Customerinfo merge(Customerinfo detachedInstance) {
		log.debug("merging Customerinfo instance");
		try {
			Customerinfo result = (Customerinfo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#attachDirty(com.zzz.hibernate.util.Customerinfo)
	 */
	@Override
	public void attachDirty(Customerinfo instance) {
		log.debug("attaching dirty Customerinfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerinfoDAO#attachClean(com.zzz.hibernate.util.Customerinfo)
	 */
	@Override
	public void attachClean(Customerinfo instance) {
		log.debug("attaching clean Customerinfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}