package com.bolgapplication.blogapplication.ServisesInt;

import java.util.List;

import com.bolgapplication.blogapplication.Dto.categoryDto;

public interface CategoryInt {

	//add
	public categoryDto addcategory(categoryDto categorydto);
	
	//update
	public categoryDto updatecategory(categoryDto categorydto , Integer id);
	
	//delete
	public void deletecategory(Integer id);
	
	//getall
	public List<categoryDto> getallcat();
	
	//getbyid
	
	public categoryDto getbyid(Integer id);
	
}
