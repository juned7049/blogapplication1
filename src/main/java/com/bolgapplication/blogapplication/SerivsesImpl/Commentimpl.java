package com.bolgapplication.blogapplication.SerivsesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolgapplication.blogapplication.Dto.CommentDto;
import com.bolgapplication.blogapplication.Exception.ResourceNotFoundException;
import com.bolgapplication.blogapplication.Respository.CommentRepo;
import com.bolgapplication.blogapplication.Respository.PostRepo;
import com.bolgapplication.blogapplication.ServisesInt.Commentsint;
@Service
public class Commentimpl  implements Commentsint{

	@Autowired
	private CommentRepo commentrepo;
	@Autowired
	private PostRepo postrepo;
	
	@Override
	public CommentDto addcomments(CommentDto commentdto, Integer postid) {
		// TODO Auto-generated method stub
		this.postrepo.findById(postid).orElseThrow(()-> new ResourceNotFoundException("post", "id", postid));
		return null;
	}

	@Override
	public void deletecomments(Integer commentsid) {
		// TODO Auto-generated method stub
		
	}

}
