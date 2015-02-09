package com.hongmeng.is.models;

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
@Table(name="project")
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6182632157918185260L;

	private Integer id;
	private String name ;
	private Date	setupDate ;
	private Date	finishedDate ;
	private Customer belongTo ;
	private Double	contractAmount ;
	private String summary ;
	private String feature ;
	private String runningInfo ;
	private String developeTools ;
	private Employee leader ;
	private CustomerEmployee customerLeader ;
	private Date createTime ;
	private User createUser ;
	private Date modifyTime ;
	private User modifyUser ;
	
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

	@Column(name="setup_date")
	public Date getSetupDate() {
		return setupDate;
	}

	public void setSetupDate(Date setupDate) {
		this.setupDate = setupDate;
	}

	@Column(name="finished_date")
	public Date getFinishedDate() {
		return finishedDate;
	}

	public void setFinishedDate(Date finishedDate) {
		this.finishedDate = finishedDate;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=Customer.class )
    @JoinColumn(name="belong_to")
	public Customer getBelongTo() {
		return belongTo;
	}

	public void setBelongTo(Customer belongTo) {
		this.belongTo = belongTo;
	}

	@Column(name="contract_amount")
	public Double getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(Double contractAmount) {
		this.contractAmount = contractAmount;
	}

	@Column(name="summary")
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Column(name="feature")
	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Column(name="running_info")
	public String getRunningInfo() {
		return runningInfo;
	}

	public void setRunningInfo(String runningInfo) {
		this.runningInfo = runningInfo;
	}

	@Column(name="develope_tools")
	public String getDevelopeTools() {
		return developeTools;
	}

	public void setDevelopeTools(String developeTools) {
		this.developeTools = developeTools;
	}
	
    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=Employee.class )
    @JoinColumn(name="leader_id")
	public Employee getLeader() {
		return leader;
	}

	public void setLeader(Employee leader) {
		this.leader = leader;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=CustomerEmployee.class )
    @JoinColumn(name="customer_leader_id")
	public CustomerEmployee getCustomerLeader() {
		return customerLeader;
	}

	public void setCustomerLeader(CustomerEmployee customerLeader) {
		this.customerLeader = customerLeader;
	}

	@Column(name="create_time")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=User.class )
    @JoinColumn(name="create_user_id")
	public User getCreateUser() {
		return createUser;
	}

	public void setCreateUser(User createUser) {
		this.createUser = createUser;
	}

	@Column(name="modify_time")
	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

    @ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, targetEntity=User.class )
    @JoinColumn(name="modify_user_id")
	public User getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(User modifyUser) {
		this.modifyUser = modifyUser;
	}
}
