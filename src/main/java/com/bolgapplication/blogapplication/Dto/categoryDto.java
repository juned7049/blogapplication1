package com.bolgapplication.blogapplication.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class categoryDto {

	
	private Integer id;
	@NotBlank(message="please fill it")
	@Size(min=4, message ="min 4")
	private String title;
	@NotBlank(message= "please fill it")
	@Size(min=10)
	private String categoryDescription;
	
	
	public categoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public categoryDto(Integer id, String title, String categoryDescription) {
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
		return "categoryDto [id=" + id + ", title=" + title + ", categoryDescription=" + categoryDescription + "]";
	}
	
	
	
	
	
	
	
	}
