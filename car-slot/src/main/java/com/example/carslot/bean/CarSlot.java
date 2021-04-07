package com.example.carslot.bean;

public class CarSlot {
	private int id;
	private String carNumber;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "CarSlot [id=" + id + ", carNumber=" + carNumber + ", color=" + color + "]";
	}
	

}
