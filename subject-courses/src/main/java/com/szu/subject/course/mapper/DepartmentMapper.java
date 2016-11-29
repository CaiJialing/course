package com.szu.subject.course.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.szu.subject.domains.Department;

@Mapper
public interface DepartmentMapper {

	public Department getDepartmentByPK(Long id);

	public int createDepartment(Department department);

	public int updateDepartment(Department department);

	public int deleteDepartment(Long id) ;

	public List<Department> getAllDepartment();

	public int batchCreateDepartment(List<Department> departments);

	public int batchUpdateDepartment(List<Department> departments);

	public int batchDeleteDepartment(List<Long> ids);
}
