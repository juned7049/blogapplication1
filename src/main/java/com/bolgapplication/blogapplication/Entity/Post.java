package com.bolgapplication.blogapplication.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
 @Column(length = 100 , nullable = false)	
	private String title ;
 @Column(length = 1000, nullable = false)
	
    private String content;
    private String imagename;
	private Date addeddate;
	
	
	//
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	@ManyToOne
	private User user;
	@OneToMany
	private List< Comments> comment;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(Integer id, String title, String content, String imagename, Date addeddate, Category category,
			User user, List<Comments> comment) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.imagename = imagename;
		this.addeddate = addeddate;
		this.category = category;
		this.user = user;
		this.comment = comment;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImagename() {
		return imagename;
	}
	public void setImagename(String imagename) {
		this.imagename = imagename;
	}
	public Date getAddeddate() {
		return addeddate;
	}
	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Comments> getComment() {
		return comment;
	}
	public void setComment(List<Comments> comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + ", imagename=" + imagename
				+ ", addeddate=" + addeddate + ", category=" + category + ", user=" + user + ", comment=" + comment
				+ "]";
	}
	
	


}
