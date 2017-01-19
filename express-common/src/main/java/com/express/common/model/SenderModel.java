package com.express.common.model;

import java.io.Serializable;

public class SenderModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Company;// 发件人公司 O
	private String Name;// 发件人 R
	private String Tel;// 电话与手机，必填一个 R
	private String Mobile;//
	private String PostCode;// 发件人邮编 O
	private String ProvinceName;// 发件省（如广东省，不要缺少“省”） R
	private String CityName;// 发件市（如深圳市，不要缺少“市”） R
	private String ExpAreaName;// 发件区（如福田区，不要缺少“区”或“县”） O
	private String Address;// 发件人详细地址 R

	public String getCompany() {
		return Company;
	}

	public SenderModel setCompany(String company) {
		Company = company;
		return this;
	}

	public String getName() {
		return Name;
	}

	public SenderModel setName(String name) {
		Name = name;
		return this;
	}

	public String getTel() {
		return Tel;
	}

	public SenderModel setTel(String tel) {
		Tel = tel;
		return this;
	}

	public String getMobile() {
		return Mobile;
	}

	public SenderModel setMobile(String mobile) {
		Mobile = mobile;
		return this;
	}

	public String getPostCode() {
		return PostCode;
	}

	public SenderModel setPostCode(String postCode) {
		PostCode = postCode;
		return this;
	}

	public String getProvinceName() {
		return ProvinceName;
	}

	public SenderModel setProvinceName(String provinceName) {
		ProvinceName = provinceName;
		return this;
	}

	public String getCityName() {
		return CityName;
	}

	public SenderModel setCityName(String cityName) {
		CityName = cityName;
		return this;
	}

	public String getExpAreaName() {
		return ExpAreaName;
	}

	public SenderModel setExpAreaName(String expAreaName) {
		ExpAreaName = expAreaName;
		return this;
	}

	public String getAddress() {
		return Address;
	}

	public SenderModel setAddress(String address) {
		Address = address;
		return this;
	}

}
