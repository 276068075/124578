package com.accp.spring.pojo;

import java.io.Serializable;
/**
 * 
 * @author MyPC
 *查寝事件记录图片表
 */
public class HealthRecordImg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3097479965840671102L;
/*
imgId		int(11) NULL图片id
healthRecordId		int(11) NULL查寝事件记录id
dormMangeId			int(11) NULL宿管id,记录人
imgPath				varchar(300) NULL图片路径
 */
	private int imgId;
	private int healthRecordId;
	private int dormMangeId;
	private String imgPath;
	public int getImgId() {
		return imgId;
	}
	public void setImgId(int imgId) {
		this.imgId = imgId;
	}
	public int getHealthRecordId() {
		return healthRecordId;
	}
	public void setHealthRecordId(int healthRecordId) {
		this.healthRecordId = healthRecordId;
	}
	public int getDormMangeId() {
		return dormMangeId;
	}
	public void setDormMangeId(int dormMangeId) {
		this.dormMangeId = dormMangeId;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
