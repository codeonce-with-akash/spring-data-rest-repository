package com.akash.data.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product_tab")
@Setter
@Getter
@ToString
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_id")
	private Long prodId;
	@Column(name = "prod_name")
	private String prodName;
	@Column(name = "prod_cost")
	private Double prodCost;
}
