package com.express.code.expressimpl.zt.model;

import java.io.Serializable;

public class CommonOrderModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String[] orderCode;// String[] 订单号集合(数组) N
	private String sendId;// String 用户ID N
	private String partnerId;// String 合作商单号 Y

	private String result;// String(32)true 或 falseN
	private String reason;// String(128)错误原因N
	private ItemModel order_list;

	public String[] getOrderCode() {
		return orderCode;
	}

	public CommonOrderModel setOrderCode(String[] orderCode) {
		this.orderCode = orderCode;
		return this;
	}

	public String getSendId() {
		return sendId;
	}

	public CommonOrderModel setSendId(String sendId) {
		this.sendId = sendId;
		return this;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public CommonOrderModel setPartnerId(String partnerId) {
		this.partnerId = partnerId;
		return this;
	}

	public String getResult() {
		return result;
	}

	public CommonOrderModel setResult(String result) {
		this.result = result;
		return this;
	}

	public String getReason() {
		return reason;
	}

	public CommonOrderModel setReason(String reason) {
		this.reason = reason;
		return this;
	}

	public ItemModel getOrder_list() {
		return order_list;
	}

	public CommonOrderModel setOrder_list(ItemModel order_list) {
		this.order_list = order_list;
		return this;
	}

}
