package com.accp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.accp.spring.service.DormitoryService;

@Controller
public class DormitoryController {
	@Autowired
	private DormitoryService dormitoryService;
	
	@GetMapping("/index")
	public Object index() {
		return this.dormitoryService.selectAllDormitory();
		 
	}
}
