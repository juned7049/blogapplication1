package com.bolgapplication.blogapplication.ServisesInt;

import com.bolgapplication.blogapplication.Dto.CommentDto;

public interface Commentsint {

	public CommentDto addcomments(CommentDto commentdto , Integer postid);
	public void deletecomments(Integer commentsid);
}
