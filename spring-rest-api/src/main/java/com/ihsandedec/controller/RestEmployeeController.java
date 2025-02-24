package com.ihsandedec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ihsandedec.model.Employee;
import com.ihsandedec.services.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {
	//Postmandan istek atıldığında ilk karşılamayı yapar.
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path = "/list")
	public List<Employee> getAllEmployeeList(){
		
		
		
		return employeeService.getAllEmployeeList();
	}
	
	@GetMapping(path = "/list/{id}")
	public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id ) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping(path = "/with-params")
	public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName" , required = false) String firstName ,
			                                    @RequestParam(name = "lastName" , required = false) String lastName){
		return employeeService.getEmployeeWithParams(firstName, lastName);
		
	}

}
