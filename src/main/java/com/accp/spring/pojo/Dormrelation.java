package com.accp.spring.pojo;

import java.io.Serializable;
/**
 * 
 * @author MyPC
 *寝室与学员关系表
 */
public class Dormrelation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2755099247504134481L;
/*
id	int(11) NOT NULL
stuId	int(11) NULL学员id
bedId	int(11) NULL床位id
startTime	datetime NULL住寝时间
endTime		datetime NULL离寝时间
isUse	int(11) NULL是否正在使用 是1，否2
 */
	private int id;
	private int stuId;
	private int bedId;
	private String startTime;
	private String endTime;
	private int isUse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getBedId() {
		return bedId;
	}
	public void setBedId(int bedId) {
		this.bedId = bedId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getIsUse() {
		return isUse;
	}
	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
