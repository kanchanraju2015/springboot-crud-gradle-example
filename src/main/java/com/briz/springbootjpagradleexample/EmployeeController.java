package com.briz.springbootjpagradleexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
@Autowired
EmployeeRepository erepo;
@RequestMapping("/test")
public String test()
{
	return "this is gradle test";
}
@RequestMapping("/save")
public String save()
{
	//
	// application.properties inside resources as similar to the maven 
	// build.gradle for dependency injection note this important 
	Employee employee=new Employee();
	employee.setAge(32);
	employee.setCity("banaras");
	employee.setName("abhi singh");
	erepo.save(employee);
	return "data saved into the database";
}
@RequestMapping("/all")
public List<Employee> all()
{
	return erepo.findAll();
}
}
