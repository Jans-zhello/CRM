package com.zzz.hibernate.util;

import java.util.Set;

/**
 * Menuinfo entity. @author MyEclipse Persistence Tools
 */
public class Menuinfo extends AbstractMenuinfo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Menuinfo() {
	}

	/** full constructor */
	public Menuinfo(String menuInfoName, Set rolerelationships) {
		super(menuInfoName, rolerelationships);
	}

}
