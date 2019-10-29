package com.example.demo.com.boot.me.service.info.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.com.boot.me.dos.info.UserInfoMapper;
import com.example.demo.com.boot.me.outVo.UserInfoVo;
import com.example.demo.com.boot.me.service.info.IUserInfoService;

@Service
public class UserInfoImpl implements IUserInfoService{
	
	@Resource
	private UserInfoMapper userDo;

	@Override
	public List<UserInfoVo> queryAllUserList() {
		
		
		return userDo.queryUserList();
	}

}
