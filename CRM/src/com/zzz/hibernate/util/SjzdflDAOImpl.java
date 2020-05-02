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
 * Sjzdfl entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zzz.hibernate.util.Sjzdfl
 * @author MyEclipse Persistence Tools
 */
public class SjzdflDAOImpl extends HibernateDaoSupport implements SjzdflDAO {
	private static final Logger log = LoggerFactory.getLogger(SjzdflDAOImpl.class);
	// property constants
	public static final String SJZDFLMC = "sjzdflmc";

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdflDAO#save(com.zzz.hibernate.util.Sjzdfl)
	 */
	@Override
	public void save(Sjzdfl transientInstance) {
		log.debug("saving Sjzdfl instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdflDAO#delete(com.zzz.hibernate.util.Sjzdfl)
	 */
	@Override
	public void delete(Sjzdfl persistentInstance) {
		log.debug("deleting Sjzdfl instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdflDAO#findById(java.lang.Integer)
	 */
	@Override
	public Sjzdfl findById(java.lang.Integer id) {
		log.debug("getting Sjzdfl instance with id: " + id);
		try {
			Sjzdfl instance = (Sjzdfl) getSession().get(
					"com.zzz.hibernate.util.Sjzdfl", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdflDAO#findByExample(com.zzz.hibernate.util.Sjzdfl)
	 */
	@Override
	public List findByExample(Sjzdfl instance) {
		log.debug("finding Sjzdfl instance by example");
		try {
			List results = getSession()
					.createCriteria("com.zzz.hibernate.util.Sjzdfl")
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
	 * @see com.zzz.hibernate.util.SjzdflDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Sjzdfl instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sjzdfl as model where model."
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
	 * @see com.zzz.hibernate.util.SjzdflDAO#findBySjzdflmc(java.lang.Object)
	 */
	@Override
	public List findBySjzdflmc(Object sjzdflmc) {
		return findByProperty(SJZDFLMC, sjzdflmc);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdflDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Sjzdfl instances");
		try {
			String queryString = "from Sjzdfl";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdflDAO#merge(com.zzz.hibernate.util.Sjzdfl)
	 */
	@Override
	public Sjzdfl merge(Sjzdfl detachedInstance) {
		log.debug("merging Sjzdfl instance");
		try {
			Sjzdfl result = (Sjzdfl) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdflDAO#attachDirty(com.zzz.hibernate.util.Sjzdfl)
	 */
	@Override
	public void attachDirty(Sjzdfl instance) {
		log.debug("attaching dirty Sjzdfl instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdflDAO#attachClean(com.zzz.hibernate.util.Sjzdfl)
	 */
	@Override
	public void attachClean(Sjzdfl instance) {
		log.debug("attaching clean Sjzdfl instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}