package com.bolgapplication.blogapplication.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolgapplication.blogapplication.Entity.Comments;

public interface CommentRepo  extends JpaRepository<Comments, Integer>{

	
	
}
