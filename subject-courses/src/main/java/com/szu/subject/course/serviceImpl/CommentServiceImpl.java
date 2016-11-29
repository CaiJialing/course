package com.szu.subject.course.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szu.subject.course.mapper.CommentMapper;
import com.szu.subject.course.service.CommentService;
import com.szu.subject.domains.Comment;
@Service
public class CommentServiceImpl implements CommentService{

	@Autowired
	private CommentMapper commentMapper;
	@Override
	public List<Comment> getCommentsByCourseId(Long id) {
		return commentMapper.getCommentsByCourseId(id);
	}

	@Override
	public Comment createComment(Comment comment) {
		commentMapper.createComment(comment);
		return comment;
	}

	@Override
	public Comment updateComment(Comment comment) {
		commentMapper.updateComment(comment);
		return comment;
	}

	@Override
	public int deleteComment(Long id) {
		return commentMapper.deleteComment(id);
	}

	@Override
	public List<Comment> batchCreateComment(List<Comment> comments) {
		commentMapper.batchCreateComment(comments);
		return comments;
	}

	@Override
	public List<Comment> batchUpdateComment(List<Comment> comments) {
		commentMapper.batchUpdateComment(comments);
		return comments;
	}

	@Override
	public int batchDeleteComment(List<Long> ids) {
		return commentMapper.batchDeleteComment(ids);
	}

}
