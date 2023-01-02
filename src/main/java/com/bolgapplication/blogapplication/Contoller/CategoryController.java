package com.bolgapplication.blogapplication.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bolgapplication.blogapplication.Dto.categoryDto;
import com.bolgapplication.blogapplication.Other.ApiResponse;
import com.bolgapplication.blogapplication.SerivsesImpl.CategoryImp;

import jakarta.validation.Valid;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryImp servises1;
	
	//add
	@PostMapping("/Category")
	public ResponseEntity<categoryDto> addcategory(@Valid @RequestBody categoryDto categorydto){
	categoryDto cat=	this.servises1.addcategory(categorydto);
	return new ResponseEntity<categoryDto>(cat, HttpStatus.ACCEPTED);
	}
	
	
	//update
	@PutMapping("/Category/{id}")
	public ResponseEntity<categoryDto> updatecategory(@Valid @RequestBody categoryDto categorydto2, @PathVariable Integer id){
		
		categoryDto cat1=this.servises1.updatecategory(categorydto2, id);
		return new ResponseEntity<categoryDto>(cat1, HttpStatus.ACCEPTED);
		
	}
	
	//delete
	@DeleteMapping("/Category/{id}")
	public ResponseEntity<ApiResponse> deletecategory(Integer id){
		 this.servises1.deletecategory(id);
		return new ResponseEntity<ApiResponse>(new ApiResponse("delete succssesfully", true), HttpStatus.OK); 
		
	}
	
	//getall
	@GetMapping("/Category")
	public ResponseEntity<List<categoryDto>> getallcat(){
	  List< categoryDto> cat4=this.servises1.getallcat();
	  return new ResponseEntity<List<categoryDto>>(cat4, HttpStatus.OK);
	  }
	
	//getbyid
    @GetMapping("/Category/{id}")
    public ResponseEntity<categoryDto> getbyid(@PathVariable Integer id){
    	categoryDto cat5=this.servises1.getbyid(id);
    	return new ResponseEntity<categoryDto>(cat5, HttpStatus.OK);
    	
    	
    }
	
	
	
	
	
	
	
	
	
}
