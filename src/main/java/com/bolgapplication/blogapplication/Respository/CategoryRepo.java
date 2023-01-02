package com.bolgapplication.blogapplication.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolgapplication.blogapplication.Entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
	

}
