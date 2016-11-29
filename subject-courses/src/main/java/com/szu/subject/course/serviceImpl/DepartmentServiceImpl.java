package com.szu.subject.course.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szu.subject.course.mapper.DepartmentMapper;
import com.szu.subject.course.service.DepartmentService;
import com.szu.subject.domains.Department;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public List<Department> getAllDepartment() {
		return departmentMapper.getAllDepartment();
	}

	@Override
	public Department createDepartment(Department department) {
		departmentMapper.createDepartment(department);
		return department;
	}

	@Override
	public Department updateDepartment(Department department) {
		departmentMapper.updateDepartment(department);
		return department;
	}

	@Override
	public int deleteDepartment(Long id) {
		return departmentMapper.deleteDepartment(id);
	}

	@Override
	public List<Department> batchCreateDepartment(List<Department> departments) {
		departmentMapper.batchCreateDepartment(departments);
		return departments;
	}

	@Override
	public List<Department> batchUpdateDepartment(List<Department> departments) {
		departmentMapper.batchUpdateDepartment(departments);
		return departments;
	}

	@Override
	public int batchDeleteDepartment(List<Long> ids) {
		return departmentMapper.batchDeleteDepartment(ids);
	}

}
