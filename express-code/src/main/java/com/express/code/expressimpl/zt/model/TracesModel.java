package com.express.code.expressimpl.zt.model;

import java.io.Serializable;

public class TracesModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String Desc;// String 跟踪信息 Y
	private String dispOrRecMan;// String 派件或收件员 Y
	private String dispOrRecManCode;// String 派件或收件员编号 Y
	private String dispOrRecManPhone;// String 派件或收件员电话 Y
	private String preOrNextSite;// String 上一站或下一站 Y
	private String preOrNextSiteCode;// String 上一站或下一站编号 Y
	private String preOrNextSitePhone;// String 上一站或下一站电话 Y
	private String Remark;// String 备注 Y
	private String scanDate;// String 扫描时间 N
	private String scanSite;// String 扫描站点 Y
	private String scanSiteCode;// String 扫描站点编号 Y
	private String scanSitePhone;// String 扫描站点电话 Y
	private String scanType;// String 扫描类型 Y
	private String signMan;// String 签收人 Y

	public String getDesc() {
		return Desc;
	}

	public TracesModel setDesc(String desc) {
		Desc = desc;
		return this;
	}

	public String getDispOrRecMan() {
		return dispOrRecMan;
	}

	public TracesModel setDispOrRecMan(String dispOrRecMan) {
		this.dispOrRecMan = dispOrRecMan;
		return this;
	}

	public String getDispOrRecManCode() {
		return dispOrRecManCode;
	}

	public TracesModel setDispOrRecManCode(String dispOrRecManCode) {
		this.dispOrRecManCode = dispOrRecManCode;
		return this;
	}

	public String getDispOrRecManPhone() {
		return dispOrRecManPhone;
	}

	public TracesModel setDispOrRecManPhone(String dispOrRecManPhone) {
		this.dispOrRecManPhone = dispOrRecManPhone;
		return this;
	}

	public String getPreOrNextSite() {
		return preOrNextSite;
	}

	public TracesModel setPreOrNextSite(String preOrNextSite) {
		this.preOrNextSite = preOrNextSite;
		return this;
	}

	public String getPreOrNextSiteCode() {
		return preOrNextSiteCode;
	}

	public TracesModel setPreOrNextSiteCode(String preOrNextSiteCode) {
		this.preOrNextSiteCode = preOrNextSiteCode;
		return this;
	}

	public String getPreOrNextSitePhone() {
		return preOrNextSitePhone;
	}

	public TracesModel setPreOrNextSitePhone(String preOrNextSitePhone) {
		this.preOrNextSitePhone = preOrNextSitePhone;
		return this;
	}

	public String getRemark() {
		return Remark;
	}

	public TracesModel setRemark(String remark) {
		Remark = remark;
		return this;
	}

	public String getScanDate() {
		return scanDate;
	}

	public TracesModel setScanDate(String scanDate) {
		this.scanDate = scanDate;
		return this;
	}

	public String getScanSite() {
		return scanSite;
	}

	public TracesModel setScanSite(String scanSite) {
		this.scanSite = scanSite;
		return this;
	}

	public String getScanSiteCode() {
		return scanSiteCode;
	}

	public TracesModel setScanSiteCode(String scanSiteCode) {
		this.scanSiteCode = scanSiteCode;
		return this;
	}

	public String getScanSitePhone() {
		return scanSitePhone;
	}

	public TracesModel setScanSitePhone(String scanSitePhone) {
		this.scanSitePhone = scanSitePhone;
		return this;
	}

	public String getScanType() {
		return scanType;
	}

	public TracesModel setScanType(String scanType) {
		this.scanType = scanType;
		return this;
	}

	public String getSignMan() {
		return signMan;
	}

	public TracesModel setSignMan(String signMan) {
		this.signMan = signMan;
		return this;
	}

}
