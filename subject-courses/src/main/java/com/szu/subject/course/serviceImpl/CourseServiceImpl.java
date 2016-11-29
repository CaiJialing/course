package com.szu.subject.course.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szu.subject.course.mapper.CourseMapper;
import com.szu.subject.course.service.CourseService;
import com.szu.subject.domains.Comment;
import com.szu.subject.domains.Course;
import com.szu.subject.domains.Department;
import com.szu.subject.domains.Selection;

/**
 * course 的service层
 * @author Shenxiaolin
 *
 */
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> getByDepartment(Long id) {
		return courseMapper.getCoursesByDepartment(id);
	}

	@Override
	public Selection getSelection(Long id) {
		return courseMapper.getSelectionByCourseId(id);
	}

	@Override
	public Course getByPK(Long id) {
		return courseMapper.getCourseByPK(id);
	}

}
