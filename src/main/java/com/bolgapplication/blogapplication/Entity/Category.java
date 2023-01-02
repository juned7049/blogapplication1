package com.bolgapplication.blogapplication.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable=false,length = 100)
	private String title;
	private String categoryDescription;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL )
	private List<Post> posts = new ArrayList<>(); 
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Category(Integer id, String title, String categoryDescription) {
		super();
		this.id = id;
		this.title = title;
		this.categoryDescription = categoryDescription;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCategoryDescription() {
		return categoryDescription;
	}


	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + title + ", categoryDescription=" + categoryDescription + "]";
	}
	
	
	
		
	
}
