package com.express.common.model;

import java.io.Serializable;

public class TracesModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String AcceptTime;// 时间 R 2014/06/25 08:05:37
	private String AcceptStation;// 描述 R"正在派件..(派件人:邓裕富,电话:18718866310)[深圳 市]"
	private String Remark;// 备注

	public String getAcceptTime() {
		return AcceptTime;
	}

	public TracesModel setAcceptTime(String acceptTime) {
		AcceptTime = acceptTime;
		return this;
	}

	public String getAcceptStation() {
		return AcceptStation;
	}

	public TracesModel setAcceptStation(String acceptStation) {
		AcceptStation = acceptStation;
		return this;
	}

	public String getRemark() {
		return Remark;
	}

	public TracesModel setRemark(String remark) {
		Remark = remark;
		return this;
	}

}
