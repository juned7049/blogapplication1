package com.bolgapplication.blogapplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Comments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String comment;
	
	@ManyToOne
	private Post post;

	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comments(int id, String comment, Post post) {
		super();
		this.id = id;
		this.comment = comment;
		this.post = post;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Comments [id=" + id + ", comment=" + comment + ", post=" + post + "]";
	}
	
	
	
	
	
}
