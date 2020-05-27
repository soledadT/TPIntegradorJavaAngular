package edu.trabajopracticointegrador.entities;

public class Day {
	
	private int Id;
	private String nameDay;
	private boolean Active;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNameDay() {
		return nameDay;
	}
	public void setNameDay(String nameDay) {
		this.nameDay = nameDay;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	
}
