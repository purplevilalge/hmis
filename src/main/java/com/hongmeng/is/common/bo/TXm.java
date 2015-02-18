package com.hongmeng.is.common.bo;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="t_xm")
public class TXm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6182632157918185260L;

	private Integer id;		// 项目id
	private String name ;	// 项目名称
	private Date	lxrq ;	// 立项日期
	private Date	wcrq ;	// 完成日期
	private TKhxx sskhxx ;	// 所属客户信息
	private Double	hte ;	// 合同额
	private String xmgs ;	// 项目概述
	private String xmtd ;	// 项目特点
	private String yxqk ;	// 运行情况
	private String kfgj ;	// 开发工具
	private TYgxx fzrxx ;	// 负责人信息
	private TJffzr jffzr ;	// 甲方负责人信息
	private Date lrrq ;		// 录入日期
	private TUser lrr ;		// 录入人
	private Date xgrq ;		// 修改日期
	private TUser xgr ;		// 修改人
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	public Integer getId() {
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

	@Column(name="lxrq")
	public Date getLxrq() {
		return lxrq ;
	}

	public void setLxrq(Date lxrq) {
		this.lxrq= lxrq ;
	}

	@Column(name="wcrq")
	public Date getWcrq() {
		return wcrq;
	}

	public void setWcrq(Date wcrq) {
		this.wcrq= wcrq ;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TKhxx.class )
    @JoinColumn(name="sskhxx_id")
	public TKhxx getSskhxx() {
		return sskhxx;
	}

	public void setSskhxx(TKhxx sskhxx) {
		this.sskhxx = sskhxx;
	}

	@Column(name="hte")
	public Double getHte() {
		return hte;
	}

	public void setHte(Double hte) {
		this.hte= hte;
	}

	@Column(name="xmgs")
	public String getXmgs() {
		return xmgs;
	}

	public void setXmgs(String xmgs) {
		this.xmgs= xmgs;
	}

	@Column(name="xmtd")
	public String getXmtd() {
		return xmtd;
	}

	public void setXmtd(String xmtd) {
		this.xmtd= xmtd;
	}

	@Column(name="yxqk")
	public String getYxqk() {
		return yxqk;
	}

	public void setYxqk(String yxqk) {
		this.yxqk= yxqk;
	}

	@Column(name="kfgj")
	public String getKfgj() {
		return kfgj;
	}

	public void setKfgj(String kfgj) {
		this.kfgj= kfgj;
	}
	
    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TYgxx.class )
    @JoinColumn(name="xmfzr_id")
	public TYgxx getFzrxx() {
		return fzrxx;
	}

	public void setFzrxx(TYgxx fzrxx) {
		this.fzrxx = fzrxx;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TJffzr.class )
    @JoinColumn(name="jffzr_id")
	public TJffzr getJffzr() {
		return jffzr ;
	}

	public void setJffzr(TJffzr jffzr) {
		this.jffzr = jffzr;
	}

	@Column(name="lrrq")
	public Date getLrrq() {
		return lrrq;
	}

	public void setLrrq(Date lrrq) {
		this.lrrq = lrrq;
	}


    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TUser.class )
    @JoinColumn(name="lrr")
	public TUser getLrr() {
		return lrr;
	}

	public void setLrr(TUser lrr) {
		this.lrr= lrr ;
	}

	@Column(name="xgrq")
	public Date getXgrq() {
		return xgrq;
	}

	public void setXgrq(Date xgrq) {
		this.xgrq= xgrq;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=TUser.class )
    @JoinColumn(name="xgr")
	public TUser getXgr() {
		return xgr;
	}

	public void setXgr(TUser xgr) {
		this.xgr= xgr;
	}
}
