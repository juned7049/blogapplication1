package com.bolgapplication.blogapplication.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolgapplication.blogapplication.Entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
