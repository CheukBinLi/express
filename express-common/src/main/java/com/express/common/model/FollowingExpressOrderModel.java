package com.express.common.model;

import java.util.List;

/***
 * 
 * @author cheuks-bin.Li
 * @email 20796698@qq.com
 * @date 2017年1月19日
 * @see 订阅
 */
public class FollowingExpressOrderModel extends BaseExpressModel {
	private static final long serialVersionUID = 1L;
	private String CallBack;// 用户自定义回调信息 O
	private String MemberID;// 会员标识(备用字段) O
	private String CustomerName;// 电子面单客户账号(与快递网点申请) O
	private String CustomerPwd;// 电子面单密码 O
	private String SendSite;// 收件网点标识 O
	private String ShipperCode;// 快递公司编码 R
	private String LogisticCode;// 快递单号 R
	private String OrderCode;// 订单编号 O
	private String MonthCode;// 月结编码 O
	private int PayType;// 邮费支付方式:1-现付，2-到付，3-月结，4-第三方支付 O
	private String ExpType;// 快递类型：1-标准快件 O
	private double Cost;// 寄件费（运费） O
	private double OtherCost;// 其他费用 O
	private ReceiverModel Receiver;//
	private SenderModel Sender;//
	private String StartDate;// 上门取货时间段:"yyyy-MM-dd HH:mm:ss"格式化，本文中所有时间格式相同 O
	private String EndDate;// O
	private double Weight;// 物品总重量kg O
	private int Quantity;// 件数/包裹数 O
	private double Volume;// 物品总体积m3 O
	private String Remark;// 备注 O
	private int IsNotice;// 是否分发到快递公司：1-不分发；0-分发.默认为0 O
	private List<AddServiceModel> AddService;
	private List<CommodityModel> Commodity;

	private String EBusinessID;// 用户ID R
	private String UpdateTime;// 时间 R
	private boolean Success;// 成功与否：true，false R
	private String Reason;// 失败原因 O
	private String EstimatedDeliveryTime;// 订单预计到货时间yyyy-mm-dd（即将上线） O

	public String getCallBack() {
		return CallBack;
	}

	public FollowingExpressOrderModel setCallBack(String callBack) {
		CallBack = callBack;
		return this;
	}

	public String getMemberID() {
		return MemberID;
	}

	public FollowingExpressOrderModel setMemberID(String memberID) {
		MemberID = memberID;
		return this;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public FollowingExpressOrderModel setCustomerName(String customerName) {
		CustomerName = customerName;
		return this;
	}

	public String getCustomerPwd() {
		return CustomerPwd;
	}

	public FollowingExpressOrderModel setCustomerPwd(String customerPwd) {
		CustomerPwd = customerPwd;
		return this;
	}

	public String getSendSite() {
		return SendSite;
	}

	public FollowingExpressOrderModel setSendSite(String sendSite) {
		SendSite = sendSite;
		return this;
	}

	public String getShipperCode() {
		return ShipperCode;
	}

	public FollowingExpressOrderModel setShipperCode(String shipperCode) {
		ShipperCode = shipperCode;
		return this;
	}

	public String getLogisticCode() {
		return LogisticCode;
	}

	public FollowingExpressOrderModel setLogisticCode(String logisticCode) {
		LogisticCode = logisticCode;
		return this;
	}

	public String getOrderCode() {
		return OrderCode;
	}

	public FollowingExpressOrderModel setOrderCode(String orderCode) {
		OrderCode = orderCode;
		return this;
	}

	public String getMonthCode() {
		return MonthCode;
	}

	public FollowingExpressOrderModel setMonthCode(String monthCode) {
		MonthCode = monthCode;
		return this;
	}

	public int getPayType() {
		return PayType;
	}

	public FollowingExpressOrderModel setPayType(int payType) {
		PayType = payType;
		return this;
	}

	public String getExpType() {
		return ExpType;
	}

	public FollowingExpressOrderModel setExpType(String expType) {
		ExpType = expType;
		return this;
	}

	public double getCost() {
		return Cost;
	}

	public FollowingExpressOrderModel setCost(double cost) {
		Cost = cost;
		return this;
	}

	public double getOtherCost() {
		return OtherCost;
	}

	public FollowingExpressOrderModel setOtherCost(double otherCost) {
		OtherCost = otherCost;
		return this;
	}

	public ReceiverModel getReceiver() {
		return Receiver;
	}

	public FollowingExpressOrderModel setReceiver(ReceiverModel receiver) {
		Receiver = receiver;
		return this;
	}

	public SenderModel getSender() {
		return Sender;
	}

	public FollowingExpressOrderModel setSender(SenderModel sender) {
		Sender = sender;
		return this;
	}

	public String getStartDate() {
		return StartDate;
	}

	public FollowingExpressOrderModel setStartDate(String startDate) {
		StartDate = startDate;
		return this;
	}

	public String getEndDate() {
		return EndDate;
	}

	public FollowingExpressOrderModel setEndDate(String endDate) {
		EndDate = endDate;
		return this;
	}

	public double getWeight() {
		return Weight;
	}

	public FollowingExpressOrderModel setWeight(double weight) {
		Weight = weight;
		return this;
	}

	public int getQuantity() {
		return Quantity;
	}

	public FollowingExpressOrderModel setQuantity(int quantity) {
		Quantity = quantity;
		return this;
	}

	public double getVolume() {
		return Volume;
	}

	public FollowingExpressOrderModel setVolume(double volume) {
		Volume = volume;
		return this;
	}

	public String getRemark() {
		return Remark;
	}

	public FollowingExpressOrderModel setRemark(String remark) {
		Remark = remark;
		return this;
	}

	public int getIsNotice() {
		return IsNotice;
	}

	public FollowingExpressOrderModel setIsNotice(int isNotice) {
		IsNotice = isNotice;
		return this;
	}

	public List<AddServiceModel> getAddService() {
		return AddService;
	}

	public FollowingExpressOrderModel setAddService(List<AddServiceModel> addService) {
		AddService = addService;
		return this;
	}

	public List<CommodityModel> getCommodity() {
		return Commodity;
	}

	public FollowingExpressOrderModel setCommodity(List<CommodityModel> commodity) {
		Commodity = commodity;
		return this;
	}

	public String getEBusinessID() {
		return EBusinessID;
	}

	public FollowingExpressOrderModel setEBusinessID(String eBusinessID) {
		EBusinessID = eBusinessID;
		return this;
	}

	public String getUpdateTime() {
		return UpdateTime;
	}

	public FollowingExpressOrderModel setUpdateTime(String updateTime) {
		UpdateTime = updateTime;
		return this;
	}

	public boolean isSuccess() {
		return Success;
	}

	public FollowingExpressOrderModel setSuccess(boolean success) {
		Success = success;
		return this;
	}

	public String getReason() {
		return Reason;
	}

	public FollowingExpressOrderModel setReason(String reason) {
		Reason = reason;
		return this;
	}

	public String getEstimatedDeliveryTime() {
		return EstimatedDeliveryTime;
	}

	public FollowingExpressOrderModel setEstimatedDeliveryTime(String estimatedDeliveryTime) {
		EstimatedDeliveryTime = estimatedDeliveryTime;
		return this;
	}

}
