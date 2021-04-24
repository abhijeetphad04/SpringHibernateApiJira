package com.tel.SpringHibernateApi.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tel.SpringHibernateApi.model.Country;
import com.tel.SpringHibernateApi.model.Employee;
import com.tel.SpringHibernateApi.model.EmployeeUI;
import com.tel.SpringHibernateApi.model.Manager;
import com.tel.SpringHibernateApi.service.EmployeeServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

//1
	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		System.out.println("In getEmployees");
		return employeeServiceImpl.findAll();
	}

	void get(){
		System.out.println("In get");
	}
//2
	@PostMapping("/addemployee")
	public String save(@RequestBody EmployeeUI employeeUI) {
		System.out.println(3343);
		System.out.println(employeeUI.getCname());
		System.out.println(employeeUI.getCountryId());
		System.out.println(employeeUI.getName());
		System.out.println(employeeUI);
		employeeUI.setId(0);
		//employeeUI.setCountryId(101);
		LocalDateTime time = java.time.LocalDateTime.now();
	
		employeeUI.setCreateddtm(time);
		employeeUI.setUpdateddtm(time);
		System.out.println(employeeUI);

		employeeServiceImpl.save(employeeUI);
		return "Employee Added Successfully";
	}
	
	@PutMapping("/updateemployee")
	public String update(@RequestBody EmployeeUI employeeUI) {
		System.out.println("in updates conroller");
		employeeServiceImpl.update(employeeUI);
		return "Employee updated Successfully";
	}
//3
	@GetMapping("/employeesbyid/{employeeId}")
	public Employee getEmployeesById(@PathVariable int employeeId) {
		System.out.println("in employeeById");
		Employee employee = employeeServiceImpl.findById(employeeId);
		return employee;
	}
//4
	@GetMapping("/employees/status/{status}")
	public List<Employee> getEmployeesByStatus(@PathVariable String status) {
		System.out.println("In employeesByStatus");
		List<Employee> employees = employeeServiceImpl.findByStatus(status);

		return employees;

	}
//5
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
System.out.println("Delete by id");
		employeeServiceImpl.deleteById(employeeId);

		return "Employee deleted!";
	}
//6
	@PostMapping("/countries")
	public String saveCountries(@RequestBody Country country) {

		country.setCountryId(0);

		employeeServiceImpl.saveCountry(country);

		return "Country added successfully.";
	}
//7
	@GetMapping("/getcountries")
	public List<Country> getCountries() {
		System.out.println("In getCountry");
		return employeeServiceImpl.findAllCountries();
	}
//8
	@DeleteMapping("/countries/{cname}")
	public String deleteCountries(@PathVariable String cname) {

		employeeServiceImpl.deleteCountryByName(cname);

		return "Country deleted!";
	}
//9
	@GetMapping("/employees/name/{name}")
	public List<Employee> getEmployeesByName(@PathVariable String name) {
		System.out.println("In employeeByName");
		List<Employee> employees = employeeServiceImpl.getEmployeeByName(name);
		return employees;

	}
//10
	@GetMapping("/employees/listofemployeebeforetoday")
	public List<Employee> getEmployeeBeforeToday() {
		LocalDateTime time = java.time.LocalDateTime.now();
		time = time.with(LocalTime.MIDNIGHT);
		List<Employee> employees = employeeServiceImpl.getEmployeeByDate(time);
		return employees;
	}
	
	@PutMapping("/countries")
	public String updateCountries(@RequestBody Country country) {
		System.out.println("In UpdateCointries");
		employeeServiceImpl.updateCountry(country);
		return "Country updated successfully.";
	}
	
	@PostMapping("/manager")
	public String registerManager(@RequestBody Manager manager) {
		employeeServiceImpl.registerManager(manager);
		return "registered successfully";
	}
}
