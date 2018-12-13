package com.accp.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.spring.pojo.Dormitory;

public interface DormitoryMapper {
	/**
	 * 查询出所有的寝室
	 * @return
	 */
	@Select("SELECT * FROM dormitory")
	List<Dormitory> selectAllDormitory();
}
