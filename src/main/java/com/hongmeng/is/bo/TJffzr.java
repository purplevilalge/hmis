package com.hongmeng.is.bo;

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
@Table(name="t_jffzr")
public class TJffzr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8529091328513174293L;

	private Integer id;
	private String name ;
	private String phone ;
	private String mobile ;
	private TDmZw zwDm ;
	private TDmBm bmDm ;
	private TDmSex sexDm ;
	private TKhxx khxx ;
	
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
	
    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TDmZw.class )
    @JoinColumn(name="zw_dm")
    public TDmZw getZwDm() {
        return zwDm;
    }
    
    public void setZwDm(TDmZw zwDm) {
    	this.zwDm = zwDm ;
    }

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TDmBm.class )
    @JoinColumn(name="bm_dm")
	public TDmBm getBmDm() {
		return bmDm;
	}

	public void setBmDm(TDmBm bmDm) {
		this.bmDm = bmDm;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TDmSex.class )
    @JoinColumn(name="sex_dm")
	public TDmSex getSexDm() {
		return sexDm;
	}

	public void setSexDm(TDmSex sexDm) {
		this.sexDm = sexDm;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TKhxx.class )
    @JoinColumn(name="khxx_id")
	public TKhxx getKhxx() {
		return khxx;
	}

	public void setKhxx(TKhxx khxx) {
		this.khxx = khxx;
	}
}
