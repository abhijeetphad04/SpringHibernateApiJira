package com.tel.SpringHibernateApi.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;


@Entity
	@Table(name = "employee", catalog = "adjt22")
	public class Employee {

		private Integer id;
		private Country country;
		private String name;
		private String phoneno;
		private String departmentit;
		private String status;
		private LocalDateTime createddtm;
		private String createdby;
		private LocalDateTime updateddtm;
		private String updatedby;

		public Employee() {
		}

		public Employee(Country country, String name, String phoneno, String departmentit, String status, LocalDateTime createddtm,
				String createdby, LocalDateTime updateddtm, String updatedby) {
			this.country = country;
			this.name = name;
			this.phoneno = phoneno;
			this.departmentit = departmentit;
			this.status = status;
			this.createddtm = createddtm;
			this.createdby = createdby;
			this.updateddtm = updateddtm;
			this.updatedby = updatedby;
		}

		@Id
		@GeneratedValue(strategy = IDENTITY)

		@Column(name = "id", unique = true, nullable = false)
		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		@ManyToOne
		@JoinColumn(name = "cid", nullable = false)
		public Country getCountry() {
			return this.country;
		}

		public void setCountry(Country country) {
			this.country = country;
		}

		@Column(name = "name", nullable = false, length = 45)
		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Column(name = "phoneno", nullable = false, length = 45)
		public String getPhoneno() {
			return this.phoneno;
		}

		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}

		@Column(name = "departmentit", nullable = false, length = 45)
		public String getDepartmentit() {
			return this.departmentit;
		}

		public void setDepartmentit(String departmentit) {
			this.departmentit = departmentit;
		}

		@Column(name = "status", nullable = false, length = 45)
		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Column(name = "createddtm", nullable = false, length = 45)
		public LocalDateTime getCreateddtm() {
			return this.createddtm;
		}

		public void setCreateddtm(LocalDateTime time) {
			this.createddtm = time;
		}

		@Column(name = "createdby", nullable = false, length = 45)
		public String getCreatedby() {
			return this.createdby;
		}

		public void setCreatedby(String createdby) {
			this.createdby = createdby;
		}

		@Column(name = "updateddtm", nullable = false, length = 45)
		public LocalDateTime getUpdateddtm() {
			return this.updateddtm;
		}

		public void setUpdateddtm(LocalDateTime time) {
			this.updateddtm = time;
		}

		@Column(name = "updatedby", nullable = false, length = 45)
		public String getUpdatedby() {
			return this.updatedby;
		}

		public void setUpdatedby(String updatedby) {
			this.updatedby = updatedby;
		}

	}
