package com.zzz.hibernate.util;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Menuinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zzz.hibernate.util.Menuinfo
 * @author MyEclipse Persistence Tools
 */
public class MenuinfoDAOImpl extends HibernateDaoSupport implements MenuinfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(MenuinfoDAOImpl.class);
	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.MenuinfoDAO#save(com.zzz.hibernate.util.Menuinfo)
	 */
	@Override
	public void save(Menuinfo transientInstance) {
		log.debug("saving Menuinfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.MenuinfoDAO#delete(com.zzz.hibernate.util.Menuinfo)
	 */
	@Override
	public void delete(Menuinfo persistentInstance) {
		log.debug("deleting Menuinfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.MenuinfoDAO#findById(java.lang.Integer)
	 */
	@Override
	public Menuinfo findById(java.lang.Integer id) {
		log.debug("getting Menuinfo instance with id: " + id);
		try {
			Menuinfo instance = (Menuinfo) getSession().get(
					"com.zzz.hibernate.util.Menuinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.MenuinfoDAO#findByExample(com.zzz.hibernate.util.Menuinfo)
	 */
	@Override
	public List findByExample(Menuinfo instance) {
		log.debug("finding Menuinfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.zzz.hibernate.util.Menuinfo")
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
	 * @see com.zzz.hibernate.util.MenuinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Menuinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Menuinfo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.MenuinfoDAO#findByMenuInfoName(java.lang.Object)
	 */
	@Override
	public List findByMenuInfoName(Object menuInfoName) {
		return findByProperty(MENU_INFO_NAME, menuInfoName);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.MenuinfoDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Menuinfo instances");
		try {
			String queryString = "from Menuinfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.MenuinfoDAO#merge(com.zzz.hibernate.util.Menuinfo)
	 */
	@Override
	public Menuinfo merge(Menuinfo detachedInstance) {
		log.debug("merging Menuinfo instance");
		try {
			Menuinfo result = (Menuinfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.MenuinfoDAO#attachDirty(com.zzz.hibernate.util.Menuinfo)
	 */
	@Override
	public void attachDirty(Menuinfo instance) {
		log.debug("attaching dirty Menuinfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.MenuinfoDAO#attachClean(com.zzz.hibernate.util.Menuinfo)
	 */
	@Override
	public void attachClean(Menuinfo instance) {
		log.debug("attaching clean Menuinfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}