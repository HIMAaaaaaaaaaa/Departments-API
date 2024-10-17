package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.DepartmentsEntity;
//import com.example.demo.services.DepartmentsService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Departments")
@EntityScan(basePackages = "com.example.demo.entity")
public class DepartmentsController<DepartmentsService> {
	private final DepartmentsService departmentsService;

	// @Autowired
	public DepartmentsController(DepartmentsService departmentsService) {
		this.departmentsService = departmentsService;
	}
	/*
	 * @GetMapping public List<DepartmentsController> selectAllDepartments() {
	 * return ((DepartmentsController) departmentsService).selectAllDepartments(); }
	 * 
	 * @GetMapping("/{departmentId}") public DepartmentsController
	 * selectDepartmentById(@PathVariable Long departmentId) { DepartmentsController
	 * department = ((DepartmentsController)
	 * departmentsService).selectDepartmentById(departmentId); return
	 * department.orElse(null); // You can return an appropriate response if not
	 * found }
	 * 
	 * 
	 * private DepartmentsController orElse(Object object) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @DeleteMapping("/{departmentId}") public void deleteDepartment(@PathVariable
	 * Long departmentId) { ((DepartmentsController)
	 * departmentsService).deleteDepartment(departmentId); }
	 * 
	 * @GetMapping("/find") public List<DepartmentsController>
	 * findDepartmentsById(@RequestParam Long departmentId) { return
	 * ((DepartmentsController)
	 * departmentsService).findDepartmentsById(departmentId); }
	 */
}
