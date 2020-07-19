package edu.trabajopracticointegrador.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Cost")
public class Cost {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private @JsonProperty  int Id;
	@Column
	private  @JsonProperty  String Description;
	@Column
	private @JsonProperty  Boolean Active;
	
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public Boolean getActive() {
		return Active;
	}
	public void setActive(Boolean active) {
		Active = active;
	}

}
