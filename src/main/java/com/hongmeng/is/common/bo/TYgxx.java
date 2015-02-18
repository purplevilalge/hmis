package com.hongmeng.is.common.bo;

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
@Table(name="t_ygxx")
public class TYgxx implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3225022587630444209L;
	
	private Integer id;
	private String name ;
    private TDmZw zwDm ;
    private String phone ;
    private String mobile ;
    private TDmSex sexDm ;
//    private User user ;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TDmZw.class )
    @JoinColumn(name="zw_dm")
	public TDmZw getZwDm() {
		return zwDm;
	}

	public void setZwDm(TDmZw zwDm) {
		this.zwDm = zwDm;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TDmSex.class )
    @JoinColumn(name="sex_dm")
	public TDmSex getSexDm() {
		return sexDm;
	}

	public void setSexDm(TDmSex sexDm) {
		this.sexDm = sexDm;
	}

	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
//	@OneToOne(mappedBy = "employee_id")
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
    	
}
