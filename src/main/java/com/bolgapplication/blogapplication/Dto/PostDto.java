package com.bolgapplication.blogapplication.Dto;

import java.util.Date;
import java.util.List;

import com.bolgapplication.blogapplication.Entity.Comments;


public class PostDto {

	
	    private Integer id;	
		private String title ;
	    private String content;
	    private String imagename;
		private Date addeddate;
	    private categoryDto category ;
        private UserDto user;
        private List<Comments> comments;
	
        public PostDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public PostDto(Integer id, String title, String content, String imagename, Date addeddate, categoryDto category,
				UserDto user, List<Comments> comments) {
			super();
			this.id = id;
			this.title = title;
			this.content = content;
			this.imagename = imagename;
			this.addeddate = addeddate;
			this.category = category;
			this.user = user;
			this.comments = comments;
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

		public categoryDto getCategory() {
			return category;
		}

		public void setCategory(categoryDto category) {
			this.category = category;
		}

		public UserDto getUser() {
			return user;
		}

		public void setUser(UserDto user) {
			this.user = user;
		}

		public List<Comments> getComments() {
			return comments;
		}

		public void setComments(List<Comments> comments) {
			this.comments = comments;
		}

		@Override
		public String toString() {
			return "PostDto [id=" + id + ", title=" + title + ", content=" + content + ", imagename=" + imagename
					+ ", addeddate=" + addeddate + ", category=" + category + ", user=" + user + ", comments="
					+ comments + "]";
		}
	

}
