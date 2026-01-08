package com.productapp.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category {
	private String categoryName;
	@Id
	@GeneratedValue(generator = "category_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "category_gen", sequenceName = "category_seq",initialValue = 20,allocationSize = 1)
	private Integer categoryId;
	
	@ManyToMany(mappedBy = "categories")
	private List<Product> products;


}
