package com.example.demo.com.boot.me.outVo;


/**
 * 用户信息类，对应user_info表
 * @author planA
 *
 */
public class UserInfoVo {
	
	private String id;
	
	private String name;
	
	private String age;
	
	private String id_card;
	
	private String regioncode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	public String getRegioncode() {
		return regioncode;
	}

	public void setRegioncode(String regioncode) {
		this.regioncode = regioncode;
	}

	@Override
	public String toString() {
		return "UserInfoVo [id=" + id + ", name=" + name + ", age=" + age + ", id_card=" + id_card + ", regioncode="
				+ regioncode + "]";
	}
	
	

}
