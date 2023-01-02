package com.bolgapplication.blogapplication.ServisesInt;

import java.util.List;

import com.bolgapplication.blogapplication.Dto.PostDto;

public interface PostInt {

	//add
	public PostDto addpost(PostDto postdto , Integer userid, Integer category);
	
	
	//update
	public PostDto updatepost(PostDto postdto, Integer postid);
	
	//delete
	public void deletepost(Integer postid);
	
	
	//getall
	public List<PostDto> getallpost();
	
	
	
	//getbyid
   public PostDto getbyid(Integer postid);	
   
   
   
   
   //getallpostbycat
   
   public List<PostDto> getbycategory(Integer categoryId);
  
   //getallpostbyuserid
   
   public List<PostDto> getbyuser(Integer userId);
   
   public List <PostDto> searchpost(String keyword);
   
   
}
