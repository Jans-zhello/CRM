package com.zzz.hibernate.util;

/**
 * Customerlevel entity. @author MyEclipse Persistence Tools
 */
public class Customerlevel extends AbstractCustomerlevel implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Customerlevel() {
	}

	/** full constructor */
	public Customerlevel(Double business, String levelName) {
		super(business, levelName);
	}

}
