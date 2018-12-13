package com.accp.spring.pojo;

import java.io.Serializable;
/**
 * 
 * @author MyPC
 *	床位表
 */
public class Bed implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5457459039234798936L;
	/*
bedId	int(11) NOT NULL床位id
dormId	int(11) NULL寝室id
bedNum	varchar(20) NULL床位号码
bedStates	int(11) NULL床位状态 正常1，损坏2，删除3
	 */
	private int bedId;
	private int dormId;
	private String bedNum;
	private int bedStates;
	public String getBedNum() {
		return bedNum;
	}
	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}
	public int getBedId() {
		return bedId;
	}
	public void setBedId(int bedId) {
		this.bedId = bedId;
	}
	public int getDormId() {
		return dormId;
	}
	public void setDormId(int dormId) {
		this.dormId = dormId;
	}
	public int getBedStates() {
		return bedStates;
	}
	public void setBedStates(int bedStates) {
		this.bedStates = bedStates;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
