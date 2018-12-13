package com.accp.spring.pojo;

import java.io.Serializable;
/**
 * 
 * @author MyPC
 *查寝事件记录表
 */
public class Healthrecord implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5544321046061198816L;
/*
 id		int(11) NOT NULL
setId	int(11) NULL扣分制度id
stuId	int(11) NULL学生id
checkTime	datetime NULL检查时间
remark		varchar(300) NULL备注
score		int(11) NULL扣分(快照)
checkPerson		int(11) NULL检查人
 */
	private int id;
	private int setId;
	private int stuId;
	private String checkTime;
	private String remark;
	private int score;
	private int checkPerson;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSetId() {
		return setId;
	}
	public void setSetId(int setId) {
		this.setId = setId;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getCheckPerson() {
		return checkPerson;
	}
	public void setCheckPerson(int checkPerson) {
		this.checkPerson = checkPerson;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
