package com.zzz.hibernate.util;

/**
 * AbstractCustomerlevel entity provides the base persistence definition of the
 * Customerlevel entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCustomerlevel implements java.io.Serializable {

	// Fields

	private Integer levelId;
	private Double business;
	private String levelName;

	// Constructors

	/** default constructor */
	public AbstractCustomerlevel() {
	}

	/** full constructor */
	public AbstractCustomerlevel(Double business, String levelName) {
		this.business = business;
		this.levelName = levelName;
	}

	// Property accessors

	public Integer getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public Double getBusiness() {
		return this.business;
	}

	public void setBusiness(Double business) {
		this.business = business;
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

}