package com.express.common.model;

import java.io.Serializable;

public class OrderModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String OrderCode;// 订单编号 R
	private String ShipperCode;// 快递公司编码 R
	private String LogisticCode;// 快递单号 O

	public String getOrderCode() {
		return OrderCode;
	}

	public OrderModel setOrderCode(String orderCode) {
		OrderCode = orderCode;
		return this;
	}

	public String getShipperCode() {
		return ShipperCode;
	}

	public OrderModel setShipperCode(String shipperCode) {
		ShipperCode = shipperCode;
		return this;
	}

	public String getLogisticCode() {
		return LogisticCode;
	}

	public OrderModel setLogisticCode(String logisticCode) {
		LogisticCode = logisticCode;
		return this;
	}

}
