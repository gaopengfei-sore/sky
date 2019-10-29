package com.example.demo.com.boot.me.controller.info;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.com.boot.me.outVo.UserInfoVo;
import com.example.demo.com.boot.me.service.info.IUserInfoService;

@RestController
public class UserInfoController {
	
	@Autowired
	private IUserInfoService userService;
	
	
	@RequestMapping("/queryAllUserList")
	@ResponseBody
	public String queryAllUserList() {
		System.out.println("comme in...");
		//List<UserInfoVo> list = userService.queryAllUserList();
	
		return userService.queryAllUserList().toString();
	}

}
