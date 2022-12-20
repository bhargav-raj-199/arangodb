package com.acheron.mobilestore.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;

import com.arangodb.springframework.annotation.Document;

/**
 * @author BhargavRajJinka
 *
 */
@Document("mobiles")
public class Mobile {

	@Id
	private Integer mobileId;
	private String name;
	private String texture;
	private double price;
	private String category;
	private double length;
	private double width;
	private double height;
	private String material;
	private double rating;
	private String description;
	private LocalDate mfgDate;
	private LocalDate launchDate;
	private String brand;
	private String model;
	private int ram;
	private int storage;
	private String os;
	private String manufacturer;
	private int battery;
	private double weight;
	private String displayTechnology;
	//private List<String> specialFeatures;
	private String color;
	//private List<String> reviews;
	private String img;
	
	
	/**
	 * @return the mobileId
	 */
	public Integer getMobileId() {
		return mobileId;
	}
	/**
	 * @param mobileId the mobileId to set
	 */
	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the texture
	 */
	public String getTexture() {
		return texture;
	}
	/**
	 * @param texture the texture to set
	 */
	public void setTexture(String texture) {
		this.texture = texture;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the mfgDate
	 */
	public LocalDate getMfgDate() {
		return mfgDate;
	}
	/**
	 * @param mfgDate the mfgDate to set
	 */
	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}
	/**
	 * @return the launchDate
	 */
	public LocalDate getLaunchDate() {
		return launchDate;
	}
	/**
	 * @param launchDate the launchDate to set
	 */
	public void setLaunchDate(LocalDate launchDate) {
		this.launchDate = launchDate;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}
	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}
	/**
	 * @return the storage
	 */
	public int getStorage() {
		return storage;
	}
	/**
	 * @param storage the storage to set
	 */
	public void setStorage(int storage) {
		this.storage = storage;
	}
	/**
	 * @return the os
	 */
	public String getOs() {
		return os;
	}
	/**
	 * @param os the os to set
	 */
	public void setOs(String os) {
		this.os = os;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the battery
	 */
	public int getBattery() {
		return battery;
	}
	/**
	 * @param battery the battery to set
	 */
	public void setBattery(int battery) {
		this.battery = battery;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the displayTechnology
	 */
	public String getDisplayTechnology() {
		return displayTechnology;
	}
	/**
	 * @param displayTechnology the displayTechnology to set
	 */
	public void setDisplayTechnology(String displayTechnology) {
		this.displayTechnology = displayTechnology;
	}
	/**
	 * @return the specialFeatures
	 */
//	public List<String> getSpecialFeatures() {
//		return specialFeatures;
//	}
//	/**
//	 * @param specialFeatures the specialFeatures to set
//	 */
//	public void setSpecialFeatures(List<String> specialFeatures) {
//		this.specialFeatures = specialFeatures;
//	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the reviews
	 */
//	public List<String> getReviews() {
//		return reviews;
//	}
//	/**
//	 * @param reviews the reviews to set
//	 */
//	public void setReviews(List<String> reviews) {
//		this.reviews = reviews;
//	}
	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}
	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}
	
	
	
	
}
