package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
@RestController
public class TestController {
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)

	public Employee firstService(@RequestParam int id) {
		
		Employee emp = new Employee();
		emp.setEmpID(1);
		emp.setName("sneha");
		emp.setDesignation("SE");
		emp.setSalay(50000);
		return emp;
		
		
		
	}
	//In progress
//	@RequestMapping(value = "/employee", method = RequestMethod.POST)
//
//	public Employee secondService(@RequestBody Employee emp) {
//		
//		System.out.println("Post Method");
//		Employee emp1 = new Employee();
//		emp1.setDesignation(emp.getDesignation());
//		emp1.setSalay(emp.getSalay());
//		emp1.setEmpID(emp.getEmpID());
//		emp1.setName(emp.getName());
//		
//		
//		return emp;
		
		
	//}
	


}
