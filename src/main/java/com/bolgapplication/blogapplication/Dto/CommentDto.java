package com.bolgapplication.blogapplication.Dto;



public class CommentDto {

	
	
	private int id;
	private String comment;
	public CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommentDto(int id, String comment) {
		super();
		this.id = id;
		this.comment = comment;
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
	@Override
	public String toString() {
		return "CommentDto [id=" + id + ", comment=" + comment + "]";
	}
	
	
	
}
