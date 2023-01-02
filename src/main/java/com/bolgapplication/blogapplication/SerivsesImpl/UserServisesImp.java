package com.bolgapplication.blogapplication.SerivsesImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolgapplication.blogapplication.Dto.UserDto;
import com.bolgapplication.blogapplication.Entity.User;
import com.bolgapplication.blogapplication.Exception.ResourceNotFoundException;
import com.bolgapplication.blogapplication.Respository.UserDao;
import com.bolgapplication.blogapplication.ServisesInt.UserServisesint;

@Service
public class UserServisesImp implements UserServisesint {

	@Autowired
	private ModelMapper modelmapper;
	
	@Autowired
	private UserDao database;
	
	public User dtotouser(UserDto userdto) {
		User user = this.modelmapper.map(userdto, User.class);
		return user;
	}
	public UserDto usertodto(User user) {
		
		UserDto userdto = this.modelmapper.map(user, UserDto.class);
		return userdto;
	}
	
	
	//add
	@Override
	public UserDto adduser(UserDto userdto) {
		// TODO Auto-generated method stub
		User user1=this.dtotouser(userdto);
		 User saveuser =this.database.save(user1);
		return this.usertodto(saveuser);
	}
	
	
	//update
	@Override
	public UserDto updateuser(UserDto userdto, Integer id) {
		// TODO Auto-generated method stub
		User user= this.database.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
		
		user.setName(userdto.getName());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		user.setAbout(userdto.getAbout());
		
		
		
		return this.usertodto(user);
	}
	
	
	//delete
	@Override
	public void deletuser(Integer id) {
		// TODO Auto-generated method stub
       	User user=this.database.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
		
       	this.database.delete(user);
		 
	    
	}
	
	//getall
	@Override
	public List<UserDto> getalluser() {
		// TODO Auto-generated method stub
		List<User> user=this.database.findAll();
		List<UserDto> userdto= user.stream().map(usedto -> this.usertodto(usedto)).collect(Collectors.toList());
		return userdto;
	}
	
	
	
	//getbyid
	
	
	@Override
	public UserDto getbyid(Integer id) {
		// TODO Auto-generated method stub
		User user=this.database.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
		return this.usertodto(user);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
