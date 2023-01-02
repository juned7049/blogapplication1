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

import com.bolgapplication.blogapplication.Dto.UserDto;
import com.bolgapplication.blogapplication.Other.ApiResponse;
import com.bolgapplication.blogapplication.SerivsesImpl.UserServisesImp;

import jakarta.validation.Valid;

@RestController
public class Usercontroller {
     @Autowired
	private UserServisesImp servises;
     
    
     @PostMapping("/User")
     public ResponseEntity<UserDto> adduser( @Valid @RequestBody UserDto userdto){
    	 UserDto userdto11=this.servises.adduser(userdto);
    	 return new ResponseEntity<UserDto>(userdto11, HttpStatus.ACCEPTED);
     }
     
     @PutMapping("/User/{id}")
     public ResponseEntity<UserDto> updateuser(@Valid @RequestBody UserDto userdto , @PathVariable Integer id){
    	 
    	 UserDto userdto2=this.servises.updateuser(userdto, id);
    	 return new ResponseEntity<UserDto>(userdto2, HttpStatus.ACCEPTED);	 
     }
     
     @DeleteMapping("/User/{id}")
     public ResponseEntity<ApiResponse> deleteuser(@PathVariable Integer id){
    	 
    	 this.servises.deletuser(id);
    	return new ResponseEntity<ApiResponse>(new ApiResponse("delete successfully", true), HttpStatus.OK);
    	 
     }
     
     
     @GetMapping("/User/{id}")
     public ResponseEntity<UserDto> getbyid(@PathVariable Integer id)
     {
    	 UserDto userdto =this.servises.getbyid(id);
    	 return new ResponseEntity<UserDto>(userdto, HttpStatus.OK);
     }
     
     @GetMapping("/User")
     public ResponseEntity<List<UserDto>> getalluser(){
    	 
    	List< UserDto> userdto=this.servises.getalluser();
    	 return new ResponseEntity<List<UserDto>>(userdto, HttpStatus.OK);
    	 
     }
     
     
     
     
     
     
     
}
