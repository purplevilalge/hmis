package com.hongmeng.is.bo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class TUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5492127085709473271L;

	private Integer id;
	private String username;
	private String passwd;
	private TYgxx ygxx;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "passwd")
	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ygxx_id")
	public TYgxx getYgxx() {
		return ygxx;
	}

	public void setYgxx(TYgxx ygxx) {
		this.ygxx = ygxx;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
