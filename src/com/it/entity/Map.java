package com.it.entity;

/**
 * Map entity. @author MyEclipse Persistence Tools
 */

public class Map implements java.io.Serializable {

	// Fields

	private Integer id;
	private Double longitude;
	private Double latitude;
	private String photo;
	private String title;
	private String describe;
	private Integer yh;
	private String time;

	// Constructors

	/** default constructor */
	public Map() {
	}

	/** full constructor */
	public Map(Double longitude, Double latitude, String photo, String title, String describe, Integer yh,
			String time) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.photo = photo;
		this.title = title;
		this.describe = describe;
		this.yh = yh;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Integer getYh() {
		return this.yh;
	}

	public void setYh(Integer yh) {
		this.yh = yh;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}