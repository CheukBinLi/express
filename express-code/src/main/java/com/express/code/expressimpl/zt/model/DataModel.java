package com.express.code.expressimpl.zt.model;

import java.io.Serializable;
import java.util.List;

public class DataModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String billCode;// String 订单编号 N
	private List<TracesModel> traces;

	public String getBillCode() {
		return billCode;
	}

	public DataModel setBillCode(String billCode) {
		this.billCode = billCode;
		return this;
	}

	public List<TracesModel> getTraces() {
		return traces;
	}

	public DataModel setTraces(List<TracesModel> traces) {
		this.traces = traces;
		return this;
	}

}
