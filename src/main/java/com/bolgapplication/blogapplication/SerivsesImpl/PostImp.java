package com.bolgapplication.blogapplication.SerivsesImpl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolgapplication.blogapplication.Dto.PostDto;
import com.bolgapplication.blogapplication.Entity.Category;
import com.bolgapplication.blogapplication.Entity.Post;
import com.bolgapplication.blogapplication.Entity.User;
import com.bolgapplication.blogapplication.Exception.ResourceNotFoundException;
import com.bolgapplication.blogapplication.Respository.CategoryRepo;
import com.bolgapplication.blogapplication.Respository.PostRepo;
import com.bolgapplication.blogapplication.Respository.UserDao;
import com.bolgapplication.blogapplication.ServisesInt.PostInt;
@Service
public class PostImp implements PostInt {
    @Autowired
	private PostRepo database2;
	
    @Autowired
    private UserDao userdso;
    
    @Autowired
    private CategoryRepo categorydao;
    
    
    
    @Autowired
	private ModelMapper modelmapper3;
	
	public Post postdtotopost( PostDto postdto1) {
		Post post1=this.modelmapper3.map(postdto1, Post.class);
	    return post1;
	}
	
	public PostDto posttopostdto(Post post) {
	PostDto postdto1 =	this.modelmapper3.map(post, PostDto.class);
       return postdto1;	
	}

	//addpost
	@Override
	public PostDto addpost(PostDto postdto , Integer userid, Integer categoryid) {
		// TODO Auto-generated method stub
	User user=	this.userdso.findById(userid).orElseThrow( ()-> new ResourceNotFoundException("User", "id", userid));
	Category category =this.categorydao.findById(categoryid).orElseThrow(()-> new ResourceNotFoundException("category", "id", categoryid));	
		
	
	Post post2=this.postdtotopost(postdto);
	
	post2.setImagename("defult.png");
	post2.setAddeddate(new Date());
	post2.setUser(user);
	post2.setCategory(category);
	
	
		Post savepost =this.database2.save(post2);
		
		return this.posttopostdto(savepost);
	}

	@Override
	public PostDto updatepost(PostDto postdto, Integer postid) {
		// TODO Auto-generated method stub
		Post post1=this.database2.findById(postid).orElseThrow(()-> new ResourceNotFoundException("post", "id", postid));
		
		post1.setTitle(postdto.getTitle());
		post1.setContent(postdto.getContent());
		post1.setImagename(postdto.getImagename());
		
		return this.posttopostdto(post1);
	}

	@Override
	public void deletepost(Integer postid) {
		// TODO Auto-generated method stub
         Post post2=this.database2.findById(postid).orElseThrow(()-> new ResourceNotFoundException("post", "id", postid));
         this.database2.delete(post2);
	}

	@Override
	public List<PostDto> getallpost() {
		// TODO Auto-generated method stub
         List<Post> post34=this.database2.findAll();   
         List<PostDto> post123 = post34.stream().map(post111 -> this.posttopostdto(post111)).collect(Collectors.toList());
		return post123;
	}

	@Override
	public PostDto getbyid(Integer postid) {
		// TODO Auto-generated method stub
		Post post12=this.database2.findById(postid).orElseThrow(() -> new ResourceNotFoundException("post", "id", postid));
		
		return this.posttopostdto(post12);
	}

	@Override
	public List<PostDto> getbycategory(Integer categoryId) {
		// TODO Auto-generated method stub
	Category cat1=	this.categorydao.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("category", "id", categoryId));
		List<Post> post = this.database2.findByCategory(cat1);
		 List<PostDto> postdto = post.stream().map(post10 -> this.posttopostdto(post10)).collect(Collectors.toList());
		
		
		
	
	return postdto;
	}

	@Override
	public List<PostDto> getbyuser(Integer userId) {
		// TODO Auto-generated method stub
		User user1=this.userdso.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "id", userId));
		List<Post> post12 = this.database2.findByUser(user1);
		 List<PostDto> postdto = post12.stream().map(post110 -> this.posttopostdto(post110)).collect(Collectors.toList());
	
		
		return postdto;
	}

	@Override
	public List<PostDto> searchpost(String keyword) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
