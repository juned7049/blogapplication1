package com.bolgapplication.blogapplication.SerivsesImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolgapplication.blogapplication.Dto.categoryDto;
import com.bolgapplication.blogapplication.Entity.Category;
import com.bolgapplication.blogapplication.Exception.ResourceNotFoundException;
import com.bolgapplication.blogapplication.Other.ApiResponse;
import com.bolgapplication.blogapplication.Respository.CategoryRepo;
import com.bolgapplication.blogapplication.ServisesInt.CategoryInt;
@Service
public class CategoryImp implements CategoryInt{

	@Autowired
	private CategoryRepo database1;
	@Autowired
	private ModelMapper modelmapper1;
	
	public Category catdtotocat(categoryDto categorydto) {
		Category category=this.modelmapper1.map(categorydto, Category.class);
		return category;
	}
	
	public categoryDto cattocatdto(Category category) {
		
		categoryDto categorydto=this.modelmapper1.map(category, categoryDto.class);
		return categorydto;
	}
	
	
	
	
	
	@Override
	public categoryDto addcategory(categoryDto categorydto) {
		// TODO Auto-generated method stub
        Category category	=this.catdtotocat(categorydto);
         Category savecat= this.database1.save(category);
		return this.cattocatdto(category);
	}

	@Override
	public categoryDto updatecategory(categoryDto categorydto, Integer id) {
		// TODO Auto-generated method stub
		Category category1 =this.database1.findById(id).orElseThrow(()-> new ResourceNotFoundException("category", "id", id));
		
		category1.setTitle(categorydto.getTitle());
		category1.setCategoryDescription(categorydto.getCategoryDescription());
		
		return this.cattocatdto(category1) ;
	}

	@Override
	public void deletecategory(Integer id) {
		// TODO Auto-generated method stub
		Category cat= this.database1.findById(id).orElseThrow(()-> new ResourceNotFoundException("category", "id", id));
		this.database1.delete(cat);
	}

	@Override
	public List<categoryDto> getallcat() {
		// TODO Auto-generated method stub
		List<Category> category3 = this.database1.findAll();
		
		List<categoryDto> categorydto4=  category3.stream().map(category -> this.cattocatdto(category)).collect(Collectors.toList());
    	
		return categorydto4;
	}

	@Override
	public categoryDto getbyid(Integer id) {
		// TODO Auto-generated method stub
		
		Category category6=this.database1.findById(id).orElseThrow(() -> new ResourceNotFoundException("category", "id", id));
		
		return this.cattocatdto(category6);
	}

}
