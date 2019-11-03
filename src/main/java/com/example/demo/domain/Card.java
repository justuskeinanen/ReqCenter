package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String type, scenario;

	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public long getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Card(String type) {
		super();
		this.type = type;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Card() {
		super();
	}

	/*
	 * create table CardType ( id bigint, name varchar(255)); insert into cardtype
	 * (id, name) values (0, "Snowcard"); select * from cardtype;
	 */

}
