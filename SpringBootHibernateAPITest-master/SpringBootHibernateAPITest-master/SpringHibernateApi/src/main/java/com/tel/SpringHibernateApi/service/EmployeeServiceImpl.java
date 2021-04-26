package com.tel.SpringHibernateApi.service;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tel.SpringHibernateApi.dao.EmployeeDaoImpl;
import com.tel.SpringHibernateApi.model.Country;
import com.tel.SpringHibernateApi.model.Employee;
import com.tel.SpringHibernateApi.model.EmployeeUI;
import com.tel.SpringHibernateApi.model.LoginModel;
import com.tel.SpringHibernateApi.model.Manager;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	
	@Autowired
	BridgeVOTO bridgeVOTO;
	
	@Override
	public List<Employee> findAll() {
		return employeeDaoImpl.findAll();
	}

	@Override
	public void save(EmployeeUI employeeUI) {
		System.out.println("In save Service");
		System.out.println(employeeUI.getCname());
		System.out.println(employeeUI.getCountryId());
		Employee employee= bridgeVOTO.convertEmployeeVOTO(employeeUI);
		employeeDaoImpl.save(employee);
	}
	
	@Override
	public void update(EmployeeUI employeeUI) {
		System.out.println("In update Service");
		System.out.println(employeeUI.getCname());
		Employee employee= bridgeVOTO.convertEmployeeVOTO(employeeUI);
		employeeDaoImpl.update(employee);
	}

	@Override
	public Employee findById(int employeeId) {
		return employeeDaoImpl.findById(employeeId);
	}

	@Override
	public List<Employee> findByStatus(String status) {
		return employeeDaoImpl.findByStatus(status);
	}

	@Override
	public List<Country> findAllCountries() {
		return employeeDaoImpl.findAllCountries();
	}

	@Override
	public void saveCountry(Country country) {
		employeeDaoImpl.saveCountry(country);
	}

	@Override
	public void deleteById(int employeeId) {
		 employeeDaoImpl.deleteById(employeeId);
	}

	@Override
	public void deleteCountryByName(String cname) {
		employeeDaoImpl.deleteCountryByName(cname);
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeByDate(LocalDateTime time) {
		return employeeDaoImpl.getEmployeeByDate(time);
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		return employeeDaoImpl.getEmployeeByName(name);
	}

	@Override
	public void updateCountry(Country country) {
		employeeDaoImpl.updateCountry(country);
	}

	@Override
	public void registerManager(Manager manager) {
		employeeDaoImpl.registerManager(manager);
	}

	@Override
	public Manager login(Manager manager) {
		return employeeDaoImpl.login(manager);
	}

}
