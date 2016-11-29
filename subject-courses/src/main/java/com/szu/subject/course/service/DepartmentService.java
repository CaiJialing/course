package com.szu.subject.course.service;

import java.util.List;

import com.szu.subject.domains.Department;

public interface DepartmentService {

	public List<Department> getAllDepartment();
	
	public Department createDepartment(Department department);
	public Department updateDepartment(Department department);
	public int deleteDepartment(Long id);
	
	
	public List<Department> batchCreateDepartment(List<Department> departments);
	public List<Department> batchUpdateDepartment(List<Department> departments);
	public int batchDeleteDepartment(List<Long> ids);
}
