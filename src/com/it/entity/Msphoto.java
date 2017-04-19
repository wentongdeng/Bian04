package com.it.entity;

/**
 * Msphoto entity. @author MyEclipse Persistence Tools
 */

public class Msphoto implements java.io.Serializable {

	// Fields

	private Integer id;
	private String address;
	private Integer did;

	// Constructors

	/** default constructor */
	public Msphoto() {
	}

	/** full constructor */
	public Msphoto(String address, Integer did) {
		this.address = address;
		this.did = did;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

}