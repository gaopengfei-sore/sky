package com.example.demo.com.boot.me.service.info;

import java.util.List;

import com.example.demo.com.boot.me.outVo.UserInfoVo;


public interface IUserInfoService {
	
	//获取所有的用户信息
	List<UserInfoVo> queryAllUserList();
	

}
