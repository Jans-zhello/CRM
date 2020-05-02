package com.zzz.hibernate.util;

/**
 * Rolerelationship entity. @author MyEclipse Persistence Tools
 */
public class Rolerelationship extends AbstractRolerelationship implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Rolerelationship() {
	}

	/** full constructor */
	public Rolerelationship(Menuinfo menuinfo, Roleinfo roleinfo, Integer access) {
		super(menuinfo, roleinfo, access);
	}

}
