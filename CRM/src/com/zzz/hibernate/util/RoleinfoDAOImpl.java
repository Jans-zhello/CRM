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
 * Roleinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.zzz.hibernate.util.Roleinfo
 * @author MyEclipse Persistence Tools
 */
public class RoleinfoDAOImpl extends HibernateDaoSupport implements RoleinfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(RoleinfoDAOImpl.class);
	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.RoleinfoDAO#save(com.zzz.hibernate.util.Roleinfo)
	 */
	@Override
	public void save(Roleinfo transientInstance) {
		log.debug("saving Roleinfo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.RoleinfoDAO#delete(com.zzz.hibernate.util.Roleinfo)
	 */
	@Override
	public void delete(Roleinfo persistentInstance) {
		log.debug("deleting Roleinfo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.RoleinfoDAO#findById(java.lang.Integer)
	 */
	@Override
	public Roleinfo findById(java.lang.Integer id) {
		log.debug("getting Roleinfo instance with id: " + id);
		try {
			Roleinfo instance = (Roleinfo) getSession().get(
					"com.zzz.hibernate.util.Roleinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.RoleinfoDAO#findByExample(com.zzz.hibernate.util.Roleinfo)
	 */
	@Override
	public List findByExample(Roleinfo instance) {
		log.debug("finding Roleinfo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.zzz.hibernate.util.Roleinfo")
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
	 * @see com.zzz.hibernate.util.RoleinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Roleinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Roleinfo as model where model."
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
	 * @see com.zzz.hibernate.util.RoleinfoDAO#findByRoleName(java.lang.Object)
	 */
	@Override
	public List findByRoleName(Object roleName) {
		return findByProperty(ROLE_NAME, roleName);
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.RoleinfoDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Roleinfo instances");
		try {
			String queryString = "from Roleinfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	@Override
	public int findAllCount() {
		log.debug("finding all Roleinfo instances");
		try {
			String queryString = "from Roleinfo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list().size();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
   @Override
   public List findAllRolesList(Page page){
		log.debug("finding all Roleinfo instances");
		try {
			String queryString = "from Roleinfo";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setFirstResult(page.getBeginIndex());
			queryObject.setMaxResults(page.getEveryPage());
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
   }
	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.RoleinfoDAO#merge(com.zzz.hibernate.util.Roleinfo)
	 */
	@Override
	public Roleinfo merge(Roleinfo detachedInstance) {
		log.debug("merging Roleinfo instance");
		try {
			Roleinfo result = (Roleinfo) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.RoleinfoDAO#attachDirty(com.zzz.hibernate.util.Roleinfo)
	 */
	@Override
	public void attachDirty(Roleinfo instance) {
		log.debug("attaching dirty Roleinfo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.zzz.hibernate.util.RoleinfoDAO#attachClean(com.zzz.hibernate.util.Roleinfo)
	 */
	@Override
	public void attachClean(Roleinfo instance) {
		log.debug("attaching clean Roleinfo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}