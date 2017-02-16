package com.express.code.expressimpl.zt.model;

import java.io.Serializable;

public class SenderModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;// String(32)发件人在合作商平台中的ID号Y
	private String name;// String(32)发件人姓名Y
	private String company;// String(64)发件公司名Y

	private String mobile;// String(32)发件人手机号码Y
	private String phone;// String(32)发件人电话号码
	private String prov;// String(32)发件人省Y
	private String city;// String(32)发件人市Y
	private String county;// String(32)发件人区Y
	private String address;// String(128)发件人详细地址Y
	private String zipcode;// String(32)发件人邮编Y

	public String getId() {
		return id;
	}

	public SenderModel setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public SenderModel setName(String name) {
		this.name = name;
		return this;
	}

	public String getCompany() {
		return company;
	}

	public SenderModel setCompany(String company) {
		this.company = company;
		return this;
	}

	public String getMobile() {
		return mobile;
	}

	public SenderModel setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public SenderModel setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getProv() {
		return prov;
	}

	public SenderModel setProv(String prov) {
		this.prov = prov;
		return this;
	}

	public String getCity() {
		return city;
	}

	public SenderModel setCity(String city) {
		this.city = city;
		return this;
	}

	public String getCounty() {
		return county;
	}

	public SenderModel setCounty(String county) {
		this.county = county;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public SenderModel setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getZipcode() {
		return zipcode;
	}

	public SenderModel setZipcode(String zipcode) {
		this.zipcode = zipcode;
		return this;
	}

	public SenderModel(String id, String name, String company, String mobile, String phone, String prov, String city, String county, String address, String zipcode) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.mobile = mobile;
		this.phone = phone;
		this.prov = prov;
		this.city = city;
		this.county = county;
		this.address = address;
		this.zipcode = zipcode;
	}

	public SenderModel() {
		super();
	}

}
