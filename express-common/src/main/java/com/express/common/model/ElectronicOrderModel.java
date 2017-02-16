package com.express.common.model;

import java.util.List;

/***
 * 电子面单
 * 
 * @author cheuks-bin.Li
 * @email 20796698@qq.com
 * @see
 */
public class ElectronicOrderModel extends BaseExpressModel {

	private static final long serialVersionUID = 1L;
	private String CallBack;// 用户自定义回调信息 O
	private String MemberID;// 会员标识 O
	private String CustomerName;// 电子面单客户账号（与快递网点申请） O
	private String CustomerPwd;// 电子面单密码 O
	private String SendSite;// 收件网点标识 O
	private String ShipperCode;// 快递公司编码 R
	private String LogisticCode;// 快递单号 O
	private String OrderCode;// 订单编号 R
	private String ThrOrderCode;// 第三方订单编号 O
	private String MonthCode;// 月结编码 C
	private int PayType;// 邮费支付方式:1-现付，2-到付，3-月结，4-第三方支付 R
	private String ExpType;// 快递类型：1-标准快件 R
	private int IsNotice;// 是否通知快递员上门揽件：0-通知；1-不通知；不填则默认为0 O
	private double Cost; // 寄件费（运费） O
	private int OtherCost;// Double 其他费用 O
	private ReceiverModel Receiver;
	private SenderModel Sender;
	private String StartDate; // 上门取货时间段:"yyyy-MM-dd HH:mm:ss"格式化，本文中所有时间格式相同 O
	private String EndDate; // O
	private double Weight; // 物品总重量kg O
	private int Quantity;// 件数/包裹数 O
	private double Volume; // 物品总体积m3 O
	private String Remark; // 备注
	private List<AddServiceModel> AddServices;
	private List<CommodityModel> Commoditys;
	private String IsReturnPrintTemplate;// 返回电子面单模板：0-不需要；1-需要

	// 回调
	private String EBusinessID;// 用户ID
	private OrderModel Order;
	private String Success;// Bool 成功与否 R
	private String ResultCode;// 错误编码 R
	private String Reason;// 失败原因 O
	private String UniquerRequestNumber;// 唯一标识 R
	private String PrintTemplate;// 面单打印模板 O
	private String EstimatedDeliveryTime;// 订单预计到货时间yyyy-mm-dd O
	private String Callback;// 用户自定义回调信息 O
	private String SubCount;// Int 子单数量 O
	private String SubOrders;// 子单号 O
	private String SubPrintTemplates;// 子单模板

	public String getCallBack() {
		return CallBack;
	}

	public ElectronicOrderModel setCallBack(String callBack) {
		CallBack = callBack;
		return this;
	}

	public String getMemberID() {
		return MemberID;
	}

	public ElectronicOrderModel setMemberID(String memberID) {
		MemberID = memberID;
		return this;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public ElectronicOrderModel setCustomerName(String customerName) {
		CustomerName = customerName;
		return this;
	}

	public String getCustomerPwd() {
		return CustomerPwd;
	}

	public ElectronicOrderModel setCustomerPwd(String customerPwd) {
		CustomerPwd = customerPwd;
		return this;
	}

	public String getSendSite() {
		return SendSite;
	}

	public ElectronicOrderModel setSendSite(String sendSite) {
		SendSite = sendSite;
		return this;
	}

	public String getShipperCode() {
		return ShipperCode;
	}

	public ElectronicOrderModel setShipperCode(String shipperCode) {
		ShipperCode = shipperCode;
		return this;
	}

	public String getLogisticCode() {
		return LogisticCode;
	}

	public ElectronicOrderModel setLogisticCode(String logisticCode) {
		LogisticCode = logisticCode;
		return this;
	}

	public String getOrderCode() {
		return OrderCode;
	}

	public ElectronicOrderModel setOrderCode(String orderCode) {
		OrderCode = orderCode;
		return this;
	}

	public String getThrOrderCode() {
		return ThrOrderCode;
	}

	public ElectronicOrderModel setThrOrderCode(String thrOrderCode) {
		ThrOrderCode = thrOrderCode;
		return this;
	}

	public String getMonthCode() {
		return MonthCode;
	}

	public ElectronicOrderModel setMonthCode(String monthCode) {
		MonthCode = monthCode;
		return this;
	}

	public int getPayType() {
		return PayType;
	}

	public ElectronicOrderModel setPayType(int payType) {
		PayType = payType;
		return this;
	}

	public String getExpType() {
		return ExpType;
	}

	public ElectronicOrderModel setExpType(String expType) {
		ExpType = expType;
		return this;
	}

	public int getIsNotice() {
		return IsNotice;
	}

	public ElectronicOrderModel setIsNotice(int isNotice) {
		IsNotice = isNotice;
		return this;
	}

	public double getCost() {
		return Cost;
	}

	public ElectronicOrderModel setCost(double cost) {
		Cost = cost;
		return this;
	}

	public int getOtherCost() {
		return OtherCost;
	}

	public ElectronicOrderModel setOtherCost(int otherCost) {
		OtherCost = otherCost;
		return this;
	}

	public ReceiverModel getReceiver() {
		return Receiver;
	}

	public ElectronicOrderModel setReceiver(ReceiverModel receiver) {
		Receiver = receiver;
		return this;
	}

	public SenderModel getSender() {
		return Sender;
	}

	public ElectronicOrderModel setSender(SenderModel sender) {
		Sender = sender;
		return this;
	}

	public String getStartDate() {
		return StartDate;
	}

	public ElectronicOrderModel setStartDate(String startDate) {
		StartDate = startDate;
		return this;
	}

	public String getEndDate() {
		return EndDate;
	}

	public ElectronicOrderModel setEndDate(String endDate) {
		EndDate = endDate;
		return this;
	}

	public double getWeight() {
		return Weight;
	}

	public ElectronicOrderModel setWeight(double weight) {
		Weight = weight;
		return this;
	}

	public int getQuantity() {
		return Quantity;
	}

	public ElectronicOrderModel setQuantity(int quantity) {
		Quantity = quantity;
		return this;
	}

	public double getVolume() {
		return Volume;
	}

	public ElectronicOrderModel setVolume(double volume) {
		Volume = volume;
		return this;
	}

	public String getRemark() {
		return Remark;
	}

	public ElectronicOrderModel setRemark(String remark) {
		Remark = remark;
		return this;
	}

	public List<AddServiceModel> getAddServices() {
		return AddServices;
	}

	public ElectronicOrderModel setAddServices(List<AddServiceModel> addServices) {
		AddServices = addServices;
		return this;
	}

	public List<CommodityModel> getCommoditys() {
		return Commoditys;
	}

	public ElectronicOrderModel setCommoditys(List<CommodityModel> commoditys) {
		Commoditys = commoditys;
		return this;
	}

	public String getIsReturnPrintTemplate() {
		return IsReturnPrintTemplate;
	}

	public ElectronicOrderModel setIsReturnPrintTemplate(String isReturnPrintTemplate) {
		IsReturnPrintTemplate = isReturnPrintTemplate;
		return this;
	}

	public String getEBusinessID() {
		return EBusinessID;
	}

	public ElectronicOrderModel setEBusinessID(String eBusinessID) {
		EBusinessID = eBusinessID;
		return this;
	}

	public OrderModel getOrder() {
		return Order;
	}

	public ElectronicOrderModel setOrder(OrderModel order) {
		Order = order;
		return this;
	}

	public String getSuccess() {
		return Success;
	}

	public ElectronicOrderModel setSuccess(String success) {
		Success = success;
		return this;
	}

	public String getResultCode() {
		return ResultCode;
	}

	public ElectronicOrderModel setResultCode(String resultCode) {
		ResultCode = resultCode;
		return this;
	}

	public String getReason() {
		return Reason;
	}

	public ElectronicOrderModel setReason(String reason) {
		Reason = reason;
		return this;
	}

	public String getUniquerRequestNumber() {
		return UniquerRequestNumber;
	}

	public ElectronicOrderModel setUniquerRequestNumber(String uniquerRequestNumber) {
		UniquerRequestNumber = uniquerRequestNumber;
		return this;
	}

	public String getPrintTemplate() {
		return PrintTemplate;
	}

	public ElectronicOrderModel setPrintTemplate(String printTemplate) {
		PrintTemplate = printTemplate;
		return this;
	}

	public String getEstimatedDeliveryTime() {
		return EstimatedDeliveryTime;
	}

	public ElectronicOrderModel setEstimatedDeliveryTime(String estimatedDeliveryTime) {
		EstimatedDeliveryTime = estimatedDeliveryTime;
		return this;
	}

	public String getCallback() {
		return Callback;
	}

	public ElectronicOrderModel setCallback(String callback) {
		Callback = callback;
		return this;
	}

	public String getSubCount() {
		return SubCount;
	}

	public ElectronicOrderModel setSubCount(String subCount) {
		SubCount = subCount;
		return this;
	}

	public String getSubOrders() {
		return SubOrders;
	}

	public ElectronicOrderModel setSubOrders(String subOrders) {
		SubOrders = subOrders;
		return this;
	}

	public String getSubPrintTemplates() {
		return SubPrintTemplates;
	}

	public ElectronicOrderModel setSubPrintTemplates(String subPrintTemplates) {
		SubPrintTemplates = subPrintTemplates;
		return this;
	}

}
