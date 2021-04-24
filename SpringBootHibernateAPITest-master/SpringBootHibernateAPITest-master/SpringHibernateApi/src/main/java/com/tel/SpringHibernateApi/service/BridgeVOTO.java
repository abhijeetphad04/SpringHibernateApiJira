package com.tel.SpringHibernateApi.service;

import org.springframework.stereotype.Service;

import com.tel.SpringHibernateApi.model.Country;
import com.tel.SpringHibernateApi.model.Employee;
import com.tel.SpringHibernateApi.model.EmployeeUI;

@Service
public class BridgeVOTO {

	public Employee convertEmployeeVOTO(EmployeeUI employeeUI) {
		System.out.println("In Bridge");
		Employee employee = new Employee();
		Country ctry=new Country();
		ctry.setCountryId(employeeUI.getCountryId());
		System.out.println(employeeUI.getCountryId());
		ctry.setCname(employeeUI.getCname());
		System.out.println("In Bridge1");
		employee.setCountry(ctry);
		System.out.println("In Bridge2");
		employee.setId(employeeUI.getId());
		employee.setName(employeeUI.getName());
		employee.setPhoneno(employeeUI.getPhoneno());
		employee.setStatus(employeeUI.getStatus());
		employee.setDepartmentit(employeeUI.getDepartmentit());
		employee.setCreateddtm(employeeUI.getCreateddtm());
		employee.setCreatedby(employeeUI.getCreatedby());
		employee.setUpdateddtm(employeeUI.getUpdateddtm());
		employee.setUpdatedby(employeeUI.getUpdatedby());
		System.out.println("In Bridge3");
		System.out.println("UI:" + employeeUI.getName());
		System.out.println("emp:" + employee.getName());
		System.out.println("UI" + employeeUI.getCname());
		System.out.println("emp" + employee.getCountry().getCname());
		return employee;
	}
}
