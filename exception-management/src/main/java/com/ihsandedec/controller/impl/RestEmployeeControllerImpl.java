package com.ihsandedec.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihsandedec.controller.RestEmployeeController;
import com.ihsandedec.dto.DtoEmployee;
import com.ihsandedec.model.RootEntity;
import com.ihsandedec.service.IEmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController{
	
	@Autowired
	private IEmployeeService employeeService;

	@GetMapping("/list/{id}")
	@Override
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
		return ok(employeeService.findEmployeeById(id));
	}

}
