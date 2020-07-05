package edu.trabajopracticointegrador.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="UserLevelCategoryDayCost")
public class UserLevelCategoryDayCost {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public @JsonProperty  int Id;
	
	@ManyToOne
	@JoinColumn(name = "FK_User", nullable = false, updatable = false)
	private @JsonProperty  User user;
	
	@ManyToOne
	@JoinColumn(name = "FK_Level", nullable = false, updatable = false)
	private @JsonProperty  Level level;
	
	@ManyToOne
	@JoinColumn(name = "FK_Category", nullable = false, updatable = false)
	private  @JsonProperty Category category;
	
	@ManyToOne
	@JoinColumn(name = "FK_Day", nullable = false, updatable = false)
	private  @JsonProperty  Day day;
	
	@ManyToOne
	@JoinColumn(name = "FK_Cost", nullable = false, updatable = false)
	private @JsonProperty Cost cost;

}
