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
 * Userinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zzz.hibernate.util.Userinfo
 * @author MyEclipse Persistence Tools
 */
public class UserinfoDAOImpl extends HibernateDaoSupport implements UserinfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(UserinfoDAOImpl.class);
	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#save(com.zzz.hibernate.util.Userinfo)
	 */
	@Override
	public void save(Userinfo transientInstance) {
		log.debug("saving Userinfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#delete(com.zzz.hibernate.util.Userinfo)
	 */
	@Override
	public void delete(Userinfo persistentInstance) {
		log.debug("deleting Userinfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#findById(java.lang.Integer)
	 */
	@Override
	public Userinfo findById(java.lang.Integer id) {
		log.debug("getting Userinfo instance with id: " + id);
		try {
			Userinfo instance = (Userinfo) getSession().get(
					"com.zzz.hibernate.util.Userinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#findByExample(com.zzz.hibernate.util.Userinfo)
	 */
	@Override
	public List findByExample(Userinfo instance) {
		log.debug("finding Userinfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.zzz.hibernate.util.Userinfo")
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
	 * @see com.zzz.hibernate.util.UserinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Userinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Userinfo as model where model."
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
	 * @see com.zzz.hibernate.util.UserinfoDAO#findByUserName(java.lang.Object)
	 */
	@Override
	public List findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#findByUserLoginName(java.lang.Object)
	 */
	@Override
	public List findByUserLoginName(Object userLoginName) {
		return findByProperty(USER_LOGIN_NAME, userLoginName);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#findByUserPassWord(java.lang.Object)
	 */
	@Override
	public List findByUserPassWord(Object userPassWord) {
		return findByProperty(USER_PASS_WORD, userPassWord);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#findByUserTelphone(java.lang.Object)
	 */
	@Override
	public List findByUserTelphone(Object userTelphone) {
		return findByProperty(USER_TELPHONE, userTelphone);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#findByUserEmail(java.lang.Object)
	 */
	@Override
	public List findByUserEmail(Object userEmail) {
		return findByProperty(USER_EMAIL, userEmail);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Userinfo instances");
		try {
			String queryString = "from Userinfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#merge(com.zzz.hibernate.util.Userinfo)
	 */
	@Override
	public Userinfo merge(Userinfo detachedInstance) {
		log.debug("merging Userinfo instance");
		try {
			Userinfo result = (Userinfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#attachDirty(com.zzz.hibernate.util.Userinfo)
	 */
	@Override
	public void attachDirty(Userinfo instance) {
		log.debug("attaching dirty Userinfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.UserinfoDAO#attachClean(com.zzz.hibernate.util.Userinfo)
	 */
	@Override
	public void attachClean(Userinfo instance) {
		log.debug("attaching clean Userinfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}