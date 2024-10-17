package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.DepartmentsEntity;
import com.example.demo.repository.DepartmentsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentsService {
	private final DepartmentsRepository departmentsRepository;

	// @Autowired

	public DepartmentsService(DepartmentsRepository departmentsRepository) {
		this.departmentsRepository = departmentsRepository;
	}

	public <Departments> List<DepartmentsEntity> selectAllDepartments() {
		return departmentsRepository.findAll();
	}

	public <Departments> Optional<DepartmentsEntity> selectDepartmentById(Long departmentId) {
		return departmentsRepository.findById(departmentId);
	}

	public void deleteDepartment(Long departmentId) {
		departmentsRepository.deleteById(departmentId);
	}

}
