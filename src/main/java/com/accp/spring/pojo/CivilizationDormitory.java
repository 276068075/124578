package com.accp.spring.pojo;

import java.io.Serializable;
/**
 * 
 * @author MyPC
 *文明寝室历史记录表
 */
public class CivilizationDormitory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3496799450305936536L;
/*
id			int(11) NOT NULL
dormId		int(11) NULL寝室Id
StartTime	datetime NULL开始评选时间
endTime		datetime NULL结束评选时间
fraction	int(11) NULL获奖寝室的分数
 */
	private int id;
	private int dormId;
	private String StartTime;
	private String endTime;
	private int fraction;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDormId() {
		return dormId;
	}
	public void setDormId(int dormId) {
		this.dormId = dormId;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getFraction() {
		return fraction;
	}
	public void setFraction(int fraction) {
		this.fraction = fraction;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
