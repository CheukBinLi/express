package com.express.code.expressimpl.zt.model;

import java.io.Serializable;

public class HeaderModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String company_id;// 合作商编码
	private String msg_type;// 接口服务子类(SEARCHBYCODE)
	private String data;// 业务数据
	private String data_digest;// 签名(帮助)

	public String getCompany_id() {
		return company_id;
	}

	public HeaderModel setCompany_id(String company_id) {
		this.company_id = company_id;
		return this;
	}

	public String getMsg_type() {
		return msg_type;
	}

	public HeaderModel setMsg_type(String msg_type) {
		this.msg_type = msg_type;
		return this;
	}

	public String getData() {
		return data;
	}

	public HeaderModel setData(String data) {
		this.data = data;
		return this;
	}

	public String getData_digest() {
		return data_digest;
	}

	public HeaderModel setData_digest(String data_digest) {
		this.data_digest = data_digest;
		return this;
	}

}
