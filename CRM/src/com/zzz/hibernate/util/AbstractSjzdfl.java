package com.zzz.hibernate.util;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSjzdfl entity provides the base persistence definition of the Sjzdfl
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSjzdfl implements java.io.Serializable {

	// Fields

	private Integer sjzdflId;
	private String sjzdflmc;
	private String enable; 
	private Set sjzdxxes = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSjzdfl() {
	}

	/** minimal constructor */
	public AbstractSjzdfl(Integer sjzdflId) {
		this.sjzdflId = sjzdflId;
	}

	/** full constructor */
	public AbstractSjzdfl(Integer sjzdflId, String sjzdflmc, Set sjzdxxes) {
		this.sjzdflId = sjzdflId;
		this.sjzdflmc = sjzdflmc;
		this.sjzdxxes = sjzdxxes;
	}

	// Property accessors

	public Integer getSjzdflId() {
		return this.sjzdflId;
	}

	public void setSjzdflId(Integer sjzdflId) {
		this.sjzdflId = sjzdflId;
	}
	
	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getSjzdflmc() {
		return this.sjzdflmc;
	}

	public void setSjzdflmc(String sjzdflmc) {
		this.sjzdflmc = sjzdflmc;
	}

	public Set getSjzdxxes() {
		return this.sjzdxxes;
	}

	public void setSjzdxxes(Set sjzdxxes) {
		this.sjzdxxes = sjzdxxes;
	}

}