package com.szu.subject.course.service;

import java.util.List;

import com.szu.subject.domains.Comment;
import com.szu.subject.domains.Course;
import com.szu.subject.domains.Department;
import com.szu.subject.domains.Selection;

/**
 * course的service层
 * @author Shenxialin
 *
 */
public interface CourseService {


	/**
	 * 根据院系id获得该院系开设的课程
	 * @param id 院系id
	 * @return
	 */
	public List<Course> getByDepartment(Long id);


	/**
	 * 获得课程的最新选课情况
	 * @param id 课程id
	 * @return
	 */
	public Selection getSelection(Long id);

	/**
	 * 获得课程信息
	 * @param id 课程id
	 * @return
	 */
	public Course getByPK(Long id);

}
