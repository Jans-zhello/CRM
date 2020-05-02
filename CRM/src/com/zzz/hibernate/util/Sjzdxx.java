package com.zzz.hibernate.util;

/**
 * Sjzdxx entity. @author MyEclipse Persistence Tools
 */
public class Sjzdxx extends AbstractSjzdxx implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Sjzdxx() {
	}

	/** minimal constructor */
	public Sjzdxx(Integer sjzdxxId) {
		super(sjzdxxId);
	}

	/** full constructor */
	public Sjzdxx(Integer sjzdxxId, Sjzdfl sjzdfl, String sjzdxxmc) {
		super(sjzdxxId, sjzdfl, sjzdxxmc);
	}

}
