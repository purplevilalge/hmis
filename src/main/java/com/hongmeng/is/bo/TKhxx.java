package com.hongmeng.is.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_khxx")
public class TKhxx implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2064548735968573114L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")	public Integer getId() {
		return id;
	}
	private Integer id;

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String name ;

	@Column(name="address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	private String address ;

	@Column(name="yb")
	public String getYb() {
		return yb;
	}

	public void setYb(String yb) {
		this.yb = yb;
	}
	private String yb ;
	
}
