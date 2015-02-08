package com.hongmeng.is.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_employee")
public class CustomerEmployee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8529091328513174293L;

	private Integer id;
	private String name ;
	private String phone ;
	private String mobile ;
	private DmPosition position ;
	private DmDepartment department ;
	private DmSex sex ;
	private Customer customer ;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")	public Integer getId() {
		return id;
	}

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
	
	@Column(name="phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Column(name="mobile")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=DmPosition.class )
    @JoinColumn(name="position_dm")
    public DmPosition getPosition() {
        return position;
    }
    
    public void setPosition(DmPosition position) {
    	this.position = position ;
    }

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=DmDepartment.class )
    @JoinColumn(name="department_dm")
	public DmDepartment getDepartment() {
		return department;
	}

	public void setDepartment(DmDepartment department) {
		this.department = department;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=DmSex.class )
    @JoinColumn(name="sex_dm")
	public DmSex getSex() {
		return sex;
	}

	public void setSex(DmSex sex) {
		this.sex = sex;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=Customer.class )
    @JoinColumn(name="customer_id")
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
