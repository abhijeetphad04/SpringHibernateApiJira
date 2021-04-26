package com.tel.SpringHibernateApi.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tel.SpringHibernateApi.model.Country;
import com.tel.SpringHibernateApi.model.Employee;
import com.tel.SpringHibernateApi.model.LoginModel;
import com.tel.SpringHibernateApi.model.Manager;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	EntityManager entityManager;

	@Override
	public List<Employee> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public void save(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);
		Transaction transaction = currentSession.beginTransaction();
		System.out.println(employee.getName());
		currentSession.save(employee);
		transaction.commit();
		System.out.println(1);
	}
	
	@Override
	public void update(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);
		Transaction transaction = currentSession.beginTransaction();
		System.out.println(employee.getName());
		currentSession.saveOrUpdate(employee);
		transaction.commit();
		System.out.println(1);
	}
	

	@Override
	public Employee findById(int employeeId) {

		Session currentSession = entityManager.unwrap(Session.class);

		Employee employee = currentSession.get(Employee.class, employeeId);

		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findByStatus(String status) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee where status=:status");
		query.setParameter("status", status);
		List<Employee> employees = query.getResultList();
		return employees;
	}

	@Override
	public List<Country> findAllCountries() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Country> query = currentSession.createQuery("from Country", Country.class);
		List<Country> countries = query.getResultList();
		return countries;
	}

	@Override
	public void saveCountry(Country country) {
		Session currentSession = entityManager.unwrap(Session.class);
		Transaction transaction = currentSession.beginTransaction();
		currentSession.save(country);
		transaction.commit();
	}

	@Override
	public void deleteById(int employeeId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Transaction transaction = currentSession.beginTransaction();
		Employee employeeObj = currentSession.get(Employee.class, employeeId);
		currentSession.delete(employeeObj);
		transaction.commit();
	}

	@Override
	public void deleteCountryByName(String cname) {
		Session currentSession = entityManager.unwrap(Session.class);
		Transaction transaction = currentSession.beginTransaction();
		Query query = currentSession.createQuery("delete from Country where cname=:countrynm");
		query.setParameter("countrynm", cname);
		query.executeUpdate();
		transaction.commit();
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeeByDate(LocalDateTime time) {

		Session currentSession = entityManager.unwrap(Session.class);

		Query<Employee> query = currentSession.createQuery("from Employee where createddtm <:time");
		query.setParameter("time", time);

		List<Employee> employees = query.getResultList();

		return employees;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeeByName(String name) {

		Session currentSession = entityManager.unwrap(Session.class);

		Query<Employee> query = currentSession.createQuery("from Employee where name=:name");
		
		query.setParameter("name", name);

		List<Employee> employee = query.getResultList();
		
		return employee;
	}

	@Override
	public void updateCountry(Country country) {
		Session currentSession = entityManager.unwrap(Session.class);
		Transaction transaction = currentSession.beginTransaction();
		currentSession.saveOrUpdate(country);
		transaction.commit();
	}
	

	@Override
	public void registerManager(Manager manager) {
		Session curentSession = entityManager.unwrap(Session.class);
		Transaction transaction = curentSession.beginTransaction();
		curentSession.save(manager);
		transaction.commit();
		System.out.println("register");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Manager login(Manager manager) {
		Session currentSession = entityManager.unwrap(Session.class);
//		String email = manager.getEmail();
//		String password = manager.getPassword();
		Query<Manager> query = currentSession.createQuery("from Manager where password=:password_ui and email=:email_ui");
		query.setParameter("email_ui", manager.getEmail());
		query.setParameter("password_ui", manager.getPassword());
		Manager manager1 = query.getSingleResult();
		return manager1;
	}
}
