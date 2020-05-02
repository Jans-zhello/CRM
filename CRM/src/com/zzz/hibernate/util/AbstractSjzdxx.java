package com.zzz.hibernate.util;

/**
 * AbstractSjzdxx entity provides the base persistence definition of the Sjzdxx
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSjzdxx implements java.io.Serializable {

	// Fields

	private Integer sjzdxxId;
	private Sjzdfl sjzdfl;
	private String enable; 
	private String sjzdxxmc;

	// Constructors

	/** default constructor */
	public AbstractSjzdxx() {
	}

	/** minimal constructor */
	public AbstractSjzdxx(Integer sjzdxxId) {
		this.sjzdxxId = sjzdxxId;
	}

	/** full constructor */
	public AbstractSjzdxx(Integer sjzdxxId, Sjzdfl sjzdfl, String sjzdxxmc) {
		this.sjzdxxId = sjzdxxId;
		this.sjzdfl = sjzdfl;
		this.sjzdxxmc = sjzdxxmc;
	}

	// Property accessors

	public Integer getSjzdxxId() {
		return this.sjzdxxId;
	}

	public void setSjzdxxId(Integer sjzdxxId) {
		this.sjzdxxId = sjzdxxId;
	}

	public Sjzdfl getSjzdfl() {
		return this.sjzdfl;
	}

	public void setSjzdfl(Sjzdfl sjzdfl) {
		this.sjzdfl = sjzdfl;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getSjzdxxmc() {
		return this.sjzdxxmc;
	}

	public void setSjzdxxmc(String sjzdxxmc) {
		this.sjzdxxmc = sjzdxxmc;
	}

}