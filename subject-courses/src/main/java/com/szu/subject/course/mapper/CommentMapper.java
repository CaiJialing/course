package com.szu.subject.course.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.szu.subject.domains.Comment;

@Mapper
public interface CommentMapper {

	public Comment getCommentByPK(Long id);

	public int createComment(Comment comment);

	public int updateComment(Comment comment);

	public int deleteComment(Long id);

	public List<Comment> getCommentsByCourseId(Long id);

	public int batchCreateComment(List<Comment> comments);

	public int batchUpdateComment(List<Comment> comments);

	public int batchDeleteComment(List<Long> ids);

}
