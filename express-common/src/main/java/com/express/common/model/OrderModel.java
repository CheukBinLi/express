package com.express.common.model;

import java.io.Serializable;

public class OrderModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String OrderCode;// 订单编号 R
	private String ShipperCode;// 快递公司编码 R
	private String LogisticCode;// 快递单号 O

	private String MarkDestination;// 大头笔 O
	private String OriginCode;// 始发地区域编码 O
	private String OriginName;// 始发地/始发网点 O
	private String DestinatioCode;// 目的地区域编码 O
	private String DestinatioName;// 目的地/到达网点 O
	private String SortingCode;// 分拣编码 O
	private String PackageCode;// 集包编码

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

	public String getMarkDestination() {
		return MarkDestination;
	}

	public OrderModel setMarkDestination(String markDestination) {
		MarkDestination = markDestination;
		return this;
	}

	public String getOriginCode() {
		return OriginCode;
	}

	public OrderModel setOriginCode(String originCode) {
		OriginCode = originCode;
		return this;
	}

	public String getOriginName() {
		return OriginName;
	}

	public OrderModel setOriginName(String originName) {
		OriginName = originName;
		return this;
	}

	public String getDestinatioCode() {
		return DestinatioCode;
	}

	public OrderModel setDestinatioCode(String destinatioCode) {
		DestinatioCode = destinatioCode;
		return this;
	}

	public String getDestinatioName() {
		return DestinatioName;
	}

	public OrderModel setDestinatioName(String destinatioName) {
		DestinatioName = destinatioName;
		return this;
	}

	public String getSortingCode() {
		return SortingCode;
	}

	public OrderModel setSortingCode(String sortingCode) {
		SortingCode = sortingCode;
		return this;
	}

	public String getPackageCode() {
		return PackageCode;
	}

	public OrderModel setPackageCode(String packageCode) {
		PackageCode = packageCode;
		return this;
	}

}
