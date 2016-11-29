package com.szu.subject.course.service;

import java.util.List;

import com.szu.subject.domains.Comment;

public interface CommentService {

	public List<Comment> getCommentsByCourseId(Long id);

	public Comment createComment(Comment comment);

	public Comment updateComment(Comment comment);

	public int deleteComment(Long id);

	public List<Comment> batchCreateComment(List<Comment> comments);

	public List<Comment> batchUpdateComment(List<Comment> comments);

	public int batchDeleteComment(List<Long> ids);
}
