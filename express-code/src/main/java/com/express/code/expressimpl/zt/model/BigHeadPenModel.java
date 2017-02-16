package com.express.code.expressimpl.zt.model;

import java.io.Serializable;

public class BigHeadPenModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String unionCode;// 唯一标示 N
	private String send_province;// 发件省 N
	private String send_city;// 发件市 Y
	private String send_district;// 发件区（县/镇） Y
	private String send_address;// 发件详细地址 N
	private String receive_province;// 收件省 N
	private String receive_city;// 收件市 N
	private String receive_district;// 收件区（县/镇） N
	private String receive_address;// 收件详细地址 N

	private String mark;// 大头笔 N
	private String print_mark;// 机打大头笔 N

	public String getUnionCode() {
		return unionCode;
	}

	public BigHeadPenModel setUnionCode(String unionCode) {
		this.unionCode = unionCode;
		return this;
	}

	public String getSend_province() {
		return send_province;
	}

	public BigHeadPenModel setSend_province(String send_province) {
		this.send_province = send_province;
		return this;
	}

	public String getSend_city() {
		return send_city;
	}

	public BigHeadPenModel setSend_city(String send_city) {
		this.send_city = send_city;
		return this;
	}

	public String getSend_district() {
		return send_district;
	}

	public BigHeadPenModel setSend_district(String send_district) {
		this.send_district = send_district;
		return this;
	}

	public String getSend_address() {
		return send_address;
	}

	public BigHeadPenModel setSend_address(String send_address) {
		this.send_address = send_address;
		return this;
	}

	public String getReceive_province() {
		return receive_province;
	}

	public BigHeadPenModel setReceive_province(String receive_province) {
		this.receive_province = receive_province;
		return this;
	}

	public String getReceive_city() {
		return receive_city;
	}

	public BigHeadPenModel setReceive_city(String receive_city) {
		this.receive_city = receive_city;
		return this;
	}

	public String getReceive_district() {
		return receive_district;
	}

	public BigHeadPenModel setReceive_district(String receive_district) {
		this.receive_district = receive_district;
		return this;
	}

	public String getReceive_address() {
		return receive_address;
	}

	public BigHeadPenModel setReceive_address(String receive_address) {
		this.receive_address = receive_address;
		return this;
	}

	public String getMark() {
		return mark;
	}

	public BigHeadPenModel setMark(String mark) {
		this.mark = mark;
		return this;
	}

	public String getPrint_mark() {
		return print_mark;
	}

	public BigHeadPenModel setPrint_mark(String print_mark) {
		this.print_mark = print_mark;
		return this;
	}

}
