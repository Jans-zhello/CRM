package com.zzz.hibernate.util;

import java.util.Set;

/**
 * Sjzdfl entity. @author MyEclipse Persistence Tools
 */
public class Sjzdfl extends AbstractSjzdfl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Sjzdfl() {
	}

	/** minimal constructor */
	public Sjzdfl(Integer sjzdflId) {
		super(sjzdflId);
	}

	/** full constructor */
	public Sjzdfl(Integer sjzdflId, String sjzdflmc, Set sjzdxxes) {
		super(sjzdflId, sjzdflmc, sjzdxxes);
	}

}
