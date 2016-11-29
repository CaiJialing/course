package com.szu.subject.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.szu.subject.course.service.ClassTimeSerivce;
import com.szu.subject.course.service.CommentService;
import com.szu.subject.course.service.CourseService;
import com.szu.subject.course.service.DepartmentService;
import com.szu.subject.domains.ClassTime;
import com.szu.subject.domains.Comment;
import com.szu.subject.domains.Course;
import com.szu.subject.domains.Department;
import com.szu.subject.domains.Selection;

/**
 * course的controller层
 * @author Shenxiaolin
 *
 */
@RequestMapping("course")
@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private CommentService commentService;
	
	@Autowired
	private ClassTimeSerivce classTimeSerivce;
	
	@RequestMapping(method = RequestMethod.POST, value = "/get-departments",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Department> getAllDepartment(){
		return departmentService.getAllDepartment();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/get-courses-by-department",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Course> getByDepartment(Long id){
		return courseService.getByDepartment(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/get-comment",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Comment> getComment(Long id){
		return commentService.getCommentsByCourseId(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/get-selection",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Selection getSelection(Long id){
		return courseService.getSelection(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/get-course-by-pk",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Course getCourseByPK(Long id){
		return courseService.getByPK(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/get-all-class-time",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<ClassTime> getAllClassTime(){
		return classTimeSerivce.getAllClassTime();
	}
}
