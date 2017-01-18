package com.express.code.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class T1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public T1 setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public T1 setName(String name) {
		this.name = name;
		return this;
	}

}
