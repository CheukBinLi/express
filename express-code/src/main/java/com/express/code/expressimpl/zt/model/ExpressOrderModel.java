package com.express.code.expressimpl.zt.model;

import java.io.Serializable;

public class ExpressOrderModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String[] billCodes;// String 运单编号集合 N

	private String status;// String(32) true 或 false N
	private String msg;// String(128) 错误原因 N
	private DataModel data;

	public String[] getBillCodes() {
		return billCodes;
	}

	public ExpressOrderModel setBillCodes(String[] billCodes) {
		this.billCodes = billCodes;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public ExpressOrderModel setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public ExpressOrderModel setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public DataModel getData() {
		return data;
	}

	public ExpressOrderModel setData(DataModel data) {
		this.data = data;
		return this;
	}

}
