package com.example.demo.com.boot.me.dos.info;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.com.boot.me.outVo.UserInfoVo;
@Mapper
public interface UserInfoMapper {
	
	  List<UserInfoVo> queryUserList();

}
