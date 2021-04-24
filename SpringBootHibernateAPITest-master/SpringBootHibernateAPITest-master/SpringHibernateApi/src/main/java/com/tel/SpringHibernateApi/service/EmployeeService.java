package com.tel.SpringHibernateApi.service;

import java.time.LocalDateTime;
import java.util.List;

import com.tel.SpringHibernateApi.model.Country;
import com.tel.SpringHibernateApi.model.Employee;
import com.tel.SpringHibernateApi.model.EmployeeUI;
import com.tel.SpringHibernateApi.model.Manager;

public interface EmployeeService {
	public List<Employee> findAll();

	public void save(EmployeeUI employeeUI);

	public void update(EmployeeUI employeeUI);
	
	public Employee findById(int employeeId);

	public List<Employee> findByStatus(String status);

	public List<Country> findAllCountries();

	public void saveCountry(Country country);

	public void deleteById(int employeeId);

	public void deleteCountryByName(String cname);

	public List<Employee> getEmployee();

	public List<Employee> getEmployeeByDate(LocalDateTime time);

	public List<Employee> getEmployeeByName(String name);

	public void updateCountry(Country country);
	
	public void registerManager(Manager manager);
}
