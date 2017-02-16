package com.express.common.model;

/***
 * 
 * @author cheuks-bin.Li
 * @email 20796698@qq.com
 * @date 2017年1月19日
 * @see 预约取件
 */
public class AppointmentOrderModel extends BaseExpressModel {

	private static final long serialVersionUID = 1L;

	private String WarehouseID;// 仓库标识 O
	private String WarehouseAddress;// 仓库地址 O
	private String CallBack;// 商户标识 O
	private String MemberID;// 会员标识 O
	private String ShipperCode;// 快递公司编码 R
	private String LogisticCode;// 快递单号 O
	private String OrderCode;// 订单编号 R
	private String MonthCode;// 月结编码 C
	private String PayType;// Int 邮费支付方式:1-现付，2-到付，3-月结，4-第三方支付 R
	private String ExpType;// Int 快递类型：1-标准快件 R
	private String Cost;// Double 寄件费（运费） O
	private String OtherCost;// Double 其他费用 O
	private ReceiverModel Receiver;
	private SenderModel Sender;
	private String StartDate;// String 上门取货时间段:"yyyy-MM-dd HH:mm:ss"格式化，本文中所有时间格式相同 O
	private String EndDate;// String O
	private String Weight;// Double 物品总重量kg O
	private String Ouantity;// Int 件数/包裹数 O
	private String Volume;// Double 物品总体积m3 O
	private String Remark;// String 备注 O
	private String EBusinessID;// String 用户ID R
	private OrderModel Order;//
	private boolean Success;// Bool 成功与否 R
	private String ResultCode;// String 结果编码 R
	private String Reason;// String 失败原因 O
	private String UniquerRequestNumber;// String 唯一标识 R

	public String getWarehouseID() {
		return WarehouseID;
	}

	public AppointmentOrderModel setWarehouseID(String warehouseID) {
		WarehouseID = warehouseID;
		return this;
	}

	public String getWarehouseAddress() {
		return WarehouseAddress;
	}

	public AppointmentOrderModel setWarehouseAddress(String warehouseAddress) {
		WarehouseAddress = warehouseAddress;
		return this;
	}

	public String getCallBack() {
		return CallBack;
	}

	public AppointmentOrderModel setCallBack(String callBack) {
		CallBack = callBack;
		return this;
	}

	public String getMemberID() {
		return MemberID;
	}

	public AppointmentOrderModel setMemberID(String memberID) {
		MemberID = memberID;
		return this;
	}

	public String getShipperCode() {
		return ShipperCode;
	}

	public AppointmentOrderModel setShipperCode(String shipperCode) {
		ShipperCode = shipperCode;
		return this;
	}

	public String getLogisticCode() {
		return LogisticCode;
	}

	public AppointmentOrderModel setLogisticCode(String logisticCode) {
		LogisticCode = logisticCode;
		return this;
	}

	public String getOrderCode() {
		return OrderCode;
	}

	public AppointmentOrderModel setOrderCode(String orderCode) {
		OrderCode = orderCode;
		return this;
	}

	public String getMonthCode() {
		return MonthCode;
	}

	public AppointmentOrderModel setMonthCode(String monthCode) {
		MonthCode = monthCode;
		return this;
	}

	public String getPayType() {
		return PayType;
	}

	public AppointmentOrderModel setPayType(String payType) {
		PayType = payType;
		return this;
	}

	public String getExpType() {
		return ExpType;
	}

	public AppointmentOrderModel setExpType(String expType) {
		ExpType = expType;
		return this;
	}

	public String getCost() {
		return Cost;
	}

	public AppointmentOrderModel setCost(String cost) {
		Cost = cost;
		return this;
	}

	public String getOtherCost() {
		return OtherCost;
	}

	public AppointmentOrderModel setOtherCost(String otherCost) {
		OtherCost = otherCost;
		return this;
	}

	public ReceiverModel getReceiver() {
		return Receiver;
	}

	public AppointmentOrderModel setReceiver(ReceiverModel receiver) {
		Receiver = receiver;
		return this;
	}

	public SenderModel getSender() {
		return Sender;
	}

	public AppointmentOrderModel setSender(SenderModel sender) {
		Sender = sender;
		return this;
	}

	public String getStartDate() {
		return StartDate;
	}

	public AppointmentOrderModel setStartDate(String startDate) {
		StartDate = startDate;
		return this;
	}

	public String getEndDate() {
		return EndDate;
	}

	public AppointmentOrderModel setEndDate(String endDate) {
		EndDate = endDate;
		return this;
	}

	public String getWeight() {
		return Weight;
	}

	public AppointmentOrderModel setWeight(String weight) {
		Weight = weight;
		return this;
	}

	public String getOuantity() {
		return Ouantity;
	}

	public AppointmentOrderModel setOuantity(String ouantity) {
		Ouantity = ouantity;
		return this;
	}

	public String getVolume() {
		return Volume;
	}

	public AppointmentOrderModel setVolume(String volume) {
		Volume = volume;
		return this;
	}

	public String getRemark() {
		return Remark;
	}

	public AppointmentOrderModel setRemark(String remark) {
		Remark = remark;
		return this;
	}

	public String getEBusinessID() {
		return EBusinessID;
	}

	public AppointmentOrderModel setEBusinessID(String eBusinessID) {
		EBusinessID = eBusinessID;
		return this;
	}

	public OrderModel getOrder() {
		return Order;
	}

	public AppointmentOrderModel setOrder(OrderModel order) {
		Order = order;
		return this;
	}

	public boolean isSuccess() {
		return Success;
	}

	public AppointmentOrderModel setSuccess(boolean success) {
		Success = success;
		return this;
	}

	public String getResultCode() {
		return ResultCode;
	}

	public AppointmentOrderModel setResultCode(String resultCode) {
		ResultCode = resultCode;
		return this;
	}

	public String getReason() {
		return Reason;
	}

	public AppointmentOrderModel setReason(String reason) {
		Reason = reason;
		return this;
	}

	public String getUniquerRequestNumber() {
		return UniquerRequestNumber;
	}

	public AppointmentOrderModel setUniquerRequestNumber(String uniquerRequestNumber) {
		UniquerRequestNumber = uniquerRequestNumber;
		return this;
	}

}
