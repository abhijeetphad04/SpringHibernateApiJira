package com.tel.SpringHibernateApi.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manager", catalog = "adjt22")
public class Manager {

	private Integer mid;
	private String name;
	private String mobile;
	private String email;
	private String status;
	private String password;
	private String address;
	private Date dob;
	private String company;
	
	public Manager(Integer mid, String name, String mobile, String email, String status, String password,
			String address, Date dob, String company) {
		super();
		this.mid = mid;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.status = status;
		this.password = password;
		this.address = address;
		this.dob = dob;
		this.company = company;
	}
	
	public Manager() {
		
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "mid", unique = true, nullable = false)
	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "mobile", nullable = false, length = 45)
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "status",length = 45)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "address", length = 45)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "dob", length = 45)
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "company", nullable = false, length = 45)
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", status="
				+ status + ", password=" + password + ", address=" + address + ", dob=" + dob + ", company=" + company
				+ "]";
	}	
}
