package com.express.code.expressimpl.zt.model;

import java.io.Serializable;
import java.util.List;

public class OrderListModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String orderCode;// String(32)订单号(没有传空,返回结果包含中通生成订单号)Y
	private String type;// Number(1)订单类型 1 普通订单 默认1Y
	private String status;// Number(2)订单状态 默认0 Y
	private String partner_code;// string(32)合作商订单号Y
	private String tradeid;// String(32)交易号，由合作商平台产生。Y
	private String mailno;// String(32)运单号，如下单时已有，请提供。Y
	private SenderModel sender;
	private ReceiverModel receiver;
	private List<ItemModel> items;

	private String other_charges;// LONG其他费用(单位:分)Y
	private String order_sum;// LONG订单总金额(单位:分)Y
	private String collect_moneytype;// String(32)到达收取币种Y
	private String collect_sum;// LONG到达收取金额，一般代收货款或者到付件才需指定(单位:分)Y
	private String remark;// String(256)订单备注Y
	private String create_date;// String(64)订单创建时间(yyyy-mm-dd hh:mi:ss)

	public String getOrderCode() {
		return orderCode;
	}

	public OrderListModel setOrderCode(String orderCode) {
		this.orderCode = orderCode;
		return this;
	}

	public String getType() {
		return type;
	}

	public OrderListModel setType(String type) {
		this.type = type;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public OrderListModel setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getPartner_code() {
		return partner_code;
	}

	public OrderListModel setPartner_code(String partner_code) {
		this.partner_code = partner_code;
		return this;
	}

	public String getTradeid() {
		return tradeid;
	}

	public OrderListModel setTradeid(String tradeid) {
		this.tradeid = tradeid;
		return this;
	}

	public String getMailno() {
		return mailno;
	}

	public OrderListModel setMailno(String mailno) {
		this.mailno = mailno;
		return this;
	}

	public SenderModel getSender() {
		return sender;
	}

	public OrderListModel setSender(SenderModel sender) {
		this.sender = sender;
		return this;
	}

	public ReceiverModel getReceiver() {
		return receiver;
	}

	public OrderListModel setReceiver(ReceiverModel receiver) {
		this.receiver = receiver;
		return this;
	}

	public List<ItemModel> getItems() {
		return items;
	}

	public OrderListModel setItems(List<ItemModel> items) {
		this.items = items;
		return this;
	}

	public String getOther_charges() {
		return other_charges;
	}

	public OrderListModel setOther_charges(String other_charges) {
		this.other_charges = other_charges;
		return this;
	}

	public String getOrder_sum() {
		return order_sum;
	}

	public OrderListModel setOrder_sum(String order_sum) {
		this.order_sum = order_sum;
		return this;
	}

	public String getCollect_moneytype() {
		return collect_moneytype;
	}

	public OrderListModel setCollect_moneytype(String collect_moneytype) {
		this.collect_moneytype = collect_moneytype;
		return this;
	}

	public String getCollect_sum() {
		return collect_sum;
	}

	public OrderListModel setCollect_sum(String collect_sum) {
		this.collect_sum = collect_sum;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public OrderListModel setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	public String getCreate_date() {
		return create_date;
	}

	public OrderListModel setCreate_date(String create_date) {
		this.create_date = create_date;
		return this;
	}

}
