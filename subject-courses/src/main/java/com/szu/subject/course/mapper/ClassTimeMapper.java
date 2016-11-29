package com.szu.subject.course.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.szu.subject.domains.ClassTime;

@Mapper
public interface ClassTimeMapper {

	public ClassTime getClassTimeByPK(Long id);

	public int createClassTime(ClassTime classTime);

	public int updateClassTime(ClassTime classTime);

	public int deleteClassTime(Long id);
	
	public List<ClassTime> getAllClassTime();
}
