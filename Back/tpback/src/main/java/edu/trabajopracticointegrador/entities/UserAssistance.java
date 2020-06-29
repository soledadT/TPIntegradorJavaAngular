package edu.trabajopracticointegrador.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="user_assistance")
public class UserAssistance {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private @JsonProperty  int Id;
	@Column
	private @JsonProperty  Date date;
	@ManyToOne
	@JoinColumn(name = "FK_User", nullable = false, updatable = false)
	private @JsonProperty  User user;
	
	

}
