package com.hibernate.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alien")
public class Alien {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	private String color;
	private String name;
	
	public Alien() {
		
	}
	
	public Alien(int id, String color, String name) {
		this.id = id;
		this.color = color;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", color=" + color + ", name=" + name + "]";
	}

}
