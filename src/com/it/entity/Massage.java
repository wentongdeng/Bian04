package com.it.entity;

/**
 * Massage entity. @author MyEclipse Persistence Tools
 */

public class Massage implements java.io.Serializable {

	// Fields

	private Integer id;
	private String text;
	private String title;
	private Integer like;
	private String time;
	private Integer yh;
	private Double longitude;
	private Double latitude;
	private Integer comment;

	// Constructors

	/** default constructor */
	public Massage() {
	}

	/** full constructor */
	public Massage(String text, String title, Integer like, String time, Integer yh, Double longitude, Double latitude,
			Integer comment) {
		this.text = text;
		this.title = title;
		this.like = like;
		this.time = time;
		this.yh = yh;
		this.longitude = longitude;
		this.latitude = latitude;
		this.comment = comment;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLike() {
		return this.like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getYh() {
		return this.yh;
	}

	public void setYh(Integer yh) {
		this.yh = yh;
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

	public Integer getComment() {
		return this.comment;
	}

	public void setComment(Integer comment) {
		this.comment = comment;
	}

}