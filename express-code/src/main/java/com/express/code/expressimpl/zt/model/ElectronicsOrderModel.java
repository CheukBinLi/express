package com.express.code.expressimpl.zt.model;

import java.io.Serializable;
import java.util.List;

public class ElectronicsOrderModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private int type;// Number(1)订单类型 1 普通订单(线上),2线下联系订单 默认1Y
	private int status;// Number(2)订单状态 默认0 Y
	private String partnerCode;// string(32)合作商订单号N
	private String tradeId;// String(32)交易号，由合作商平台产生。Y
	private String mailNo;// String(32)运单号(有则提供,线下联系订单必须提供)Y
	private String siteName;// String(32)站点名称(有则提供,线下联系订单必须提供)Y
	private SenderModel sender;
	private ReceiverModel receiver;
	private List<ItemModel> items;
	private String starttime;// Timestamp取件起始时间Y
	private String endtime;// Timestamp取件截至时间Y
	private double weight;// LONG订单总重量 （克）Y
	private double size;// String(32)订单包裹大小（厘米）, 用半角的逗号来分隔长宽高Y
	private int quantity;// NUMBER订单包裹内货物总数量Y
	private double price;// LONG订单包裹中商品总价值Y
	private double freight;// LONG运输费(单位:分)Y
	private double premium;// LONG保险费(单位:分)Y
	private double packCharges;// LONG包装费(单位:分)Y
	private double otherCharges;// LONG其他费用(单位:分)Y
	private double orderSum;// LONG订单总金额(单位:分)Y
	private String collectMoneytype;// String(32)到达收取币种Y
	private double collectSum;// LONG到达收取金额，一般代收货款或者到付件才需指定(单位:分)Y
	private String remark;// String(256)订单备注Y

	private String orderCode;//
	private String result;//
	private String reason;//

	public int getType() {
		return type;
	}

	public ElectronicsOrderModel setType(int type) {
		this.type = type;
		return this;
	}

	public int getStatus() {
		return status;
	}

	public ElectronicsOrderModel setStatus(int status) {
		this.status = status;
		return this;
	}

	public String getPartnerCode() {
		return partnerCode;
	}

	public ElectronicsOrderModel setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
		return this;
	}

	public String getTradeId() {
		return tradeId;
	}

	public ElectronicsOrderModel setTradeId(String tradeId) {
		this.tradeId = tradeId;
		return this;
	}

	public String getMailNo() {
		return mailNo;
	}

	public ElectronicsOrderModel setMailNo(String mailNo) {
		this.mailNo = mailNo;
		return this;
	}

	public String getSiteName() {
		return siteName;
	}

	public ElectronicsOrderModel setSiteName(String siteName) {
		this.siteName = siteName;
		return this;
	}

	public SenderModel getSender() {
		return sender;
	}

	public ElectronicsOrderModel setSender(SenderModel sender) {
		this.sender = sender;
		return this;
	}

	public ReceiverModel getReceiver() {
		return receiver;
	}

	public ElectronicsOrderModel setReceiver(ReceiverModel receiver) {
		this.receiver = receiver;
		return this;
	}

	public List<ItemModel> getItems() {
		return items;
	}

	public ElectronicsOrderModel setItems(List<ItemModel> items) {
		this.items = items;
		return this;
	}

	public String getStarttime() {
		return starttime;
	}

	public ElectronicsOrderModel setStarttime(String starttime) {
		this.starttime = starttime;
		return this;
	}

	public String getEndtime() {
		return endtime;
	}

	public ElectronicsOrderModel setEndtime(String endtime) {
		this.endtime = endtime;
		return this;
	}

	public double getWeight() {
		return weight;
	}

	public ElectronicsOrderModel setWeight(double weight) {
		this.weight = weight;
		return this;
	}

	public double getSize() {
		return size;
	}

	public ElectronicsOrderModel setSize(double size) {
		this.size = size;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public ElectronicsOrderModel setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public double getPrice() {
		return price;
	}

	public ElectronicsOrderModel setPrice(double price) {
		this.price = price;
		return this;
	}

	public double getFreight() {
		return freight;
	}

	public ElectronicsOrderModel setFreight(double freight) {
		this.freight = freight;
		return this;
	}

	public double getPremium() {
		return premium;
	}

	public ElectronicsOrderModel setPremium(double premium) {
		this.premium = premium;
		return this;
	}

	public double getPackCharges() {
		return packCharges;
	}

	public ElectronicsOrderModel setPackCharges(double packCharges) {
		this.packCharges = packCharges;
		return this;
	}

	public double getOtherCharges() {
		return otherCharges;
	}

	public ElectronicsOrderModel setOtherCharges(double otherCharges) {
		this.otherCharges = otherCharges;
		return this;
	}

	public double getOrderSum() {
		return orderSum;
	}

	public ElectronicsOrderModel setOrderSum(double orderSum) {
		this.orderSum = orderSum;
		return this;
	}

	public String getCollectMoneytype() {
		return collectMoneytype;
	}

	public ElectronicsOrderModel setCollectMoneytype(String collectMoneytype) {
		this.collectMoneytype = collectMoneytype;
		return this;
	}

	public double getCollectSum() {
		return collectSum;
	}

	public ElectronicsOrderModel setCollectSum(double collectSum) {
		this.collectSum = collectSum;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public ElectronicsOrderModel setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public ElectronicsOrderModel setOrderCode(String orderCode) {
		this.orderCode = orderCode;
		return this;
	}

	public String getResult() {
		return result;
	}

	public ElectronicsOrderModel setResult(String result) {
		this.result = result;
		return this;
	}

	public String getReason() {
		return reason;
	}

	public ElectronicsOrderModel setReason(String reason) {
		this.reason = reason;
		return this;
	}

}
