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
 * Sjzdxx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zzz.hibernate.util.Sjzdxx
 * @author MyEclipse Persistence Tools
 */
public class SjzdxxDAOImpl extends HibernateDaoSupport implements SjzdxxDAO {
	private static final Logger log = LoggerFactory.getLogger(SjzdxxDAOImpl.class);
	// property constants
	public static final String SJZDXXMC = "sjzdxxmc";

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdxxDAO#save(com.zzz.hibernate.util.Sjzdxx)
	 */
	@Override
	public void save(Sjzdxx transientInstance) {
		log.debug("saving Sjzdxx instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdxxDAO#delete(com.zzz.hibernate.util.Sjzdxx)
	 */
	@Override
	public void delete(Sjzdxx persistentInstance) {
		log.debug("deleting Sjzdxx instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdxxDAO#findById(java.lang.Integer)
	 */
	@Override
	public Sjzdxx findById(java.lang.Integer id) {
		log.debug("getting Sjzdxx instance with id: " + id);
		try {
			Sjzdxx instance = (Sjzdxx) getSession().get(
					"com.zzz.hibernate.util.Sjzdxx", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdxxDAO#findByExample(com.zzz.hibernate.util.Sjzdxx)
	 */
	@Override
	public List findByExample(Sjzdxx instance) {
		log.debug("finding Sjzdxx instance by example");
		try {
			List results = getSession()
					.createCriteria("com.zzz.hibernate.util.Sjzdxx")
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
	 * @see com.zzz.hibernate.util.SjzdxxDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Sjzdxx instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sjzdxx as model where model."
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
	 * @see com.zzz.hibernate.util.SjzdxxDAO#findBySjzdxxmc(java.lang.Object)
	 */
	@Override
	public List findBySjzdxxmc(Object sjzdxxmc) {
		return findByProperty(SJZDXXMC, sjzdxxmc);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdxxDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Sjzdxx instances");
		try {
			String queryString = "from Sjzdxx";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdxxDAO#merge(com.zzz.hibernate.util.Sjzdxx)
	 */
	@Override
	public Sjzdxx merge(Sjzdxx detachedInstance) {
		log.debug("merging Sjzdxx instance");
		try {
			Sjzdxx result = (Sjzdxx) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdxxDAO#attachDirty(com.zzz.hibernate.util.Sjzdxx)
	 */
	@Override
	public void attachDirty(Sjzdxx instance) {
		log.debug("attaching dirty Sjzdxx instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.SjzdxxDAO#attachClean(com.zzz.hibernate.util.Sjzdxx)
	 */
	@Override
	public void attachClean(Sjzdxx instance) {
		log.debug("attaching clean Sjzdxx instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}