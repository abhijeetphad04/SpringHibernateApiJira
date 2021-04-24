package com.tel.SpringHibernateApi.model;

import java.time.LocalDateTime;

public class EmployeeUI {
	private Integer id;
	private  Integer countryid;
	private String cname;
	private String name;
	private String phoneno;
	private String departmentit;
	private String status;
	private LocalDateTime createddtm;
	private String createdby;
	private LocalDateTime updateddtm;
	private String updatedby;
	
	
	
	public EmployeeUI() {
		
	}


	public EmployeeUI(Integer id, Integer countryid, String cname, String name, String phoneno, String departmentit,
			String status, LocalDateTime createddtm, String createdby, LocalDateTime updateddtm, String updatedby) {
		super();
		this.id = id;
		this.countryid = countryid;
		this.cname = cname;
		this.name = name;
		this.phoneno = phoneno;
		this.departmentit = departmentit;
		this.status = status;
		this.createddtm = createddtm;
		this.createdby = createdby;
		this.updateddtm = updateddtm;
		this.updatedby = updatedby;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public int getCountryId() {
		return countryid;
	}


	public void setCountryId(Integer countryid) {
		this.countryid = countryid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getDepartmentit() {
		return departmentit;
	}


	public void setDepartmentit(String departmentit) {
		this.departmentit = departmentit;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public LocalDateTime getCreateddtm() {
		return createddtm;
	}


	public void setCreateddtm(LocalDateTime createddtm) {
		this.createddtm = createddtm;
	}


	public String getCreatedby() {
		return createdby;
	}


	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}


	public LocalDateTime getUpdateddtm() {
		return updateddtm;
	}


	public void setUpdateddtm(LocalDateTime updateddtm) {
		this.updateddtm = updateddtm;
	}


	public String getUpdatedby() {
		return updatedby;
	}


	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}


	@Override
	public String toString() {
		return "EmployeeUI [id=" + id + ", countryid=" + countryid + ", cname=" + cname + ", name=" + name + ", phoneno=" + phoneno
				+ ", departmentit=" + departmentit + ", status=" + status + ", createddtm=" + createddtm
				+ ", createdby=" + createdby + ", updateddtm=" + updateddtm + ", updatedby=" + updatedby + "]";
	}
	
	
}
