package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Product {
	@Id
	private String id;

	private String name;

	private Double price;

	private Double weight;

	@Enumerated(EnumType.STRING)
	private Category category;

}
