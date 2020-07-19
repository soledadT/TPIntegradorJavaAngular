package edu.trabajopracticointegrador.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Day")
public class Day {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private @JsonProperty  int Id;
	@Column
	private @JsonProperty  String NameDay;
	@Column
	private  @JsonProperty boolean Active;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNameDay() {
		return NameDay;
	}
	public void setNameDay(String nameDay) {
		this.NameDay = nameDay;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	
}
