package com.express.common.model;

import java.io.Serializable;

public class ReceiverModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String Company;// 收件人公司 O
	private String Name;// 收件人 R
	private String Tel;// 电话与手机，必填一个 R
	private String Mobile;//
	private String PostCode;// 收件人邮编 O
	private String ProvinceName;// 收件省（如广东省，不要缺少“省”） R
	private String CityName;// 收件市（如深圳市，不要缺少“市”） R
	private String ExpAreaName;// 收件区（如福田区，不要缺少“区”或“县”） O
	private String Address;// 收件人详细地址 R

	public String getCompany() {
		return Company;
	}

	public ReceiverModel setCompany(String company) {
		Company = company;
		return this;
	}

	public String getName() {
		return Name;
	}

	public ReceiverModel setName(String name) {
		Name = name;
		return this;
	}

	public String getTel() {
		return Tel;
	}

	public ReceiverModel setTel(String tel) {
		Tel = tel;
		return this;
	}

	public String getMobile() {
		return Mobile;
	}

	public ReceiverModel setMobile(String mobile) {
		Mobile = mobile;
		return this;
	}

	public String getPostCode() {
		return PostCode;
	}

	public ReceiverModel setPostCode(String postCode) {
		PostCode = postCode;
		return this;
	}

	public String getProvinceName() {
		return ProvinceName;
	}

	public ReceiverModel setProvinceName(String provinceName) {
		ProvinceName = provinceName;
		return this;
	}

	public String getCityName() {
		return CityName;
	}

	public ReceiverModel setCityName(String cityName) {
		CityName = cityName;
		return this;
	}

	public String getExpAreaName() {
		return ExpAreaName;
	}

	public ReceiverModel setExpAreaName(String expAreaName) {
		ExpAreaName = expAreaName;
		return this;
	}

	public String getAddress() {
		return Address;
	}

	public ReceiverModel setAddress(String address) {
		Address = address;
		return this;
	}

}
