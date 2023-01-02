package com.bolgapplication.blogapplication.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolgapplication.blogapplication.Entity.Category;
import com.bolgapplication.blogapplication.Entity.Post;
import com.bolgapplication.blogapplication.Entity.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	
	public List<Post> findByUser(User user);
	public List<Post> findByCategory(Category category);
}
