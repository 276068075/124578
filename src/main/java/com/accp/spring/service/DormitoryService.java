package com.accp.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.mapper.DormitoryMapper;
import com.accp.spring.pojo.Dormitory;

@Service
public class DormitoryService {
	@Autowired
	private DormitoryMapper dormitoryMapper;
	/**
	 * 查询所有的寝室
	 * @return
	 */
	public List<Dormitory> selectAllDormitory(){
		return this.dormitoryMapper.selectAllDormitory();
	}
}
