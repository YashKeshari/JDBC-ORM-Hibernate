package com.nagarro.Hbm.model;

import javax.persistence.Column;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="csvalues")
public class HbmMySqlValues {

	@Override
	public String toString() {
		return "HbmMySqlValues [id=" + id + ", name=" + name + ", colour=" + colour + ", gender_recommendation="
				+ gender_recommendation + ", size=" + size + ", price=" + price + ", rating=" + rating
				+ ", availability=" + availability + "]";
	}
	@Id
	@Column(name = "id",unique=true,columnDefinition="VARCHAR(64)")
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="colour")
	private String colour;
	@Column(name="gender")
	private String gender_recommendation;
	@Column(name="size")
	private String size;
	@Column(name="price")
    private double price;
	@Column(name="rating")
    private double rating;
	@Column(name="availability")
    private String availability;
	
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getGender_recommendation() {
		return gender_recommendation;
	}
	public void setGender_recommendation(String gender_recommendation) {
		this.gender_recommendation = gender_recommendation;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	

}
