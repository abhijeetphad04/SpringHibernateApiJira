package com.tel.SpringHibernateApi.model;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country", catalog = "adjt22")
public class Country {

	private Integer countryid;
	private String cname;

	public Country() {
	}

	public Country(String cname) {
		this.cname = cname;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "cid", unique = true, nullable = false)
	public Integer getCountryId() {
		return this.countryid;
	}

	public void setCountryId(Integer countryid) {
		this.countryid = countryid;
	}

	@Column(name = "cname", nullable = false)
	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
