package com.szu.subject.course.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szu.subject.course.mapper.ClassTimeMapper;
import com.szu.subject.course.service.ClassTimeSerivce;
import com.szu.subject.domains.ClassTime;

@Service
public class ClassTimeSerivceImpl implements ClassTimeSerivce {

	@Autowired
	private ClassTimeMapper classTimeMapper;
	
	@Override
	public List<ClassTime> getAllClassTime() {
		return classTimeMapper.getAllClassTime();
	}

}
