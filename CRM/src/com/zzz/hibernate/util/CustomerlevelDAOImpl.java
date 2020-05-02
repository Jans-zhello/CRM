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
 * Customerlevel entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.zzz.hibernate.util.Customerlevel
 * @author MyEclipse Persistence Tools
 */
public class CustomerlevelDAOImpl extends HibernateDaoSupport implements CustomerlevelDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CustomerlevelDAOImpl.class);
	// property constants
	public static final String BUSINESS = "business";
	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#save(com.zzz.hibernate.util.Customerlevel)
	 */
	@Override
	public void save(Customerlevel transientInstance) {
		log.debug("saving Customerlevel instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#delete(com.zzz.hibernate.util.Customerlevel)
	 */
	@Override
	public void delete(Customerlevel persistentInstance) {
		log.debug("deleting Customerlevel instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#findById(java.lang.Integer)
	 */
	@Override
	public Customerlevel findById(java.lang.Integer id) {
		log.debug("getting Customerlevel instance with id: " + id);
		try {
			Customerlevel instance = (Customerlevel) getSession().get(
					"com.zzz.hibernate.util.Customerlevel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#findByExample(com.zzz.hibernate.util.Customerlevel)
	 */
	@Override
	public List findByExample(Customerlevel instance) {
		log.debug("finding Customerlevel instance by example");
		try {
			List results = getSession()
					.createCriteria("com.zzz.hibernate.util.Customerlevel")
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
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Customerlevel instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Customerlevel as model where model."
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
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#findByBusiness(java.lang.Object)
	 */
	@Override
	public List findByBusiness(Object business) {
		return findByProperty(BUSINESS, business);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#findByLevelName(java.lang.Object)
	 */
	@Override
	public List findByLevelName(Object levelName) {
		return findByProperty(LEVEL_NAME, levelName);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Customerlevel instances");
		try {
			String queryString = "from Customerlevel";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#merge(com.zzz.hibernate.util.Customerlevel)
	 */
	@Override
	public Customerlevel merge(Customerlevel detachedInstance) {
		log.debug("merging Customerlevel instance");
		try {
			Customerlevel result = (Customerlevel) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#attachDirty(com.zzz.hibernate.util.Customerlevel)
	 */
	@Override
	public void attachDirty(Customerlevel instance) {
		log.debug("attaching dirty Customerlevel instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.CustomerlevelDAO#attachClean(com.zzz.hibernate.util.Customerlevel)
	 */
	@Override
	public void attachClean(Customerlevel instance) {
		log.debug("attaching clean Customerlevel instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}