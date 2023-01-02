package com.bolgapplication.blogapplication.ServisesInt;

import java.util.List;

import com.bolgapplication.blogapplication.Dto.UserDto;

public interface UserServisesint {

	//add
	public UserDto adduser(UserDto userdto);
	
	//update
	public UserDto updateuser(UserDto userdto , Integer id);
	//delete
	public void deletuser(Integer id);
	//getall
	public List<UserDto> getalluser();
	//getbyid
	public UserDto getbyid(Integer id);
	
	
}
