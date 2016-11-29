package com.szu.subject.course.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.szu.subject.domains.Course;
import com.szu.subject.domains.Selection;
import com.szu.subject.domains.User;

@Mapper
public interface CourseMapper {
	
	public Course getCourseByPK(Long id);
	
	public int createCourse(Course course);
	
	public int updateCourse(Course course);
	
	public int deleteCourse(Long id);
	
	public int updateSelection(Map map);
	
	public List<Course> getCoursesByDepartment(Long id);
	
	public List<User> getUsers(Long id);

	public Selection getSelectionByCourseId(Long id);
}
