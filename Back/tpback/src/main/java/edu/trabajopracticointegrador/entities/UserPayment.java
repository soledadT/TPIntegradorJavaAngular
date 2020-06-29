package edu.trabajopracticointegrador.entities;

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
@Table(name="UserPayment")
public class UserPayment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public @JsonProperty  int Id;
	@Column
	public @JsonProperty int Cost;
	@Column
	public @JsonProperty int ParcialPayment;
	@ManyToOne
	@JoinColumn(name = "FK_User", nullable = false, updatable = false)
	private User user;
	
	
	
	
	
	
	

}
