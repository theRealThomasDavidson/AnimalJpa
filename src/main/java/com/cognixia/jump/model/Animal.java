package com.cognixia.jump.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
	@Id				//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//auto increment
	private Integer id;
	@Column(unique=true, nullable = false)
	private String name;
	@Column(columnDefinition = "varchar(100) default 'Life'")
	private String family;

	public Animal() {
		
	}
	
	
	public Animal(Integer id, String name, String family) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
	}


	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", family=" + family + ", getClass()=" + getClass() + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

}
