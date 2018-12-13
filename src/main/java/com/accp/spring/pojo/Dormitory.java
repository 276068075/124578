package com.accp.spring.pojo;

import java.io.Serializable;
/**
 * 
 * @author MyPC
 * 寝室表
 */
public class Dormitory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7796038499382882342L;
	/*
	dormId  int(11) NULL寝室id
	dormNum  varchar(50) NULL寝室号
	dormMangeId  int(11) NULL宿管id
	adminId   int(11) NULL寝室长
	dormType   int(11) NULL 寝室类别 1:男寝 2:女寝
	 */
	/**
	 * 
	 */
	
	private int dormId;
	private String dormNum;
	private int dormMangeId;
	private int adminId;
	private int dormType;
	public int getDormId() {
		return dormId;
	}
	public void setDormId(int dormId) {
		this.dormId = dormId;
	}
	public String getDormNum() {
		return dormNum;
	}
	public void setDormNum(String dormNum) {
		this.dormNum = dormNum;
	}
	public int getDormMangeId() {
		return dormMangeId;
	}
	public void setDormMangeId(int dormMangeId) {
		this.dormMangeId = dormMangeId;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getDormType() {
		return dormType;
	}
	public void setDormType(int dormType) {
		this.dormType = dormType;
	}
	

}
