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

import com.bolgapplication.blogapplication.Dto.PostDto;
import com.bolgapplication.blogapplication.Other.ApiResponse;
import com.bolgapplication.blogapplication.SerivsesImpl.PostImp;

@RestController
public class PostController {

	@Autowired
	private PostImp servises;
	
	
 //add
	@PostMapping("User/{userid}/category/{categoryid}/post")
		public ResponseEntity<PostDto> addpost( @PathVariable Integer userid , @PathVariable Integer categoryid, @RequestBody PostDto postDto){
	
		  PostDto post12=this.servises.addpost(postDto, userid, categoryid);
		  return new ResponseEntity<PostDto>(post12, HttpStatus.CREATED);
	}
		
	//update
	@PutMapping("/Post/{postid}")
	public ResponseEntity<PostDto> updatepost(@RequestBody PostDto postdto ,@PathVariable Integer postid){
		
		PostDto postu=this.servises.updatepost(postdto, postid);
		return new ResponseEntity<PostDto>(postu, HttpStatus.ACCEPTED);
	}
	
	//delete
	@DeleteMapping("/Post/{postid}")
	public ResponseEntity<ApiResponse> deletepost(@PathVariable Integer postid){
		
		this.servises.deletepost(postid);
		return new ResponseEntity<ApiResponse>(new ApiResponse("delete successfully", true), HttpStatus.OK);
		
	}
	//get all
	@GetMapping("/Post")
	public ResponseEntity<List<PostDto> >getallpost(){
		List<PostDto> postge=this.servises.getallpost();
		return new ResponseEntity<List<PostDto>>(postge, HttpStatus.OK);
		
	}
	
	//get by cat
	@GetMapping("/Post/category/{categoryId}")
	public ResponseEntity <List<PostDto>> getbycategory(@PathVariable Integer categoryId){
		
		List<PostDto> postca =this.servises.getbycategory(categoryId);
		return new ResponseEntity<List<PostDto>>(postca, HttpStatus.OK);
		
	}
	//get by user
	
	@GetMapping("/Post/{userId}")
	public ResponseEntity <List<PostDto>> getbyuser(@PathVariable Integer userId){
		
		List<PostDto> postus =this.servises.getbyuser(userId);
		return new ResponseEntity<List<PostDto>>(postus, HttpStatus.OK);
		
	}
	
	//get by id
	
	@GetMapping("/Post/{postid}")
	public ResponseEntity <PostDto> getbyid(@PathVariable Integer postid){
		
		PostDto posti =this.servises.getbyid(postid);
		return new ResponseEntity<PostDto>(posti, HttpStatus.OK);
		
	}
	
	
	
	
	
}
