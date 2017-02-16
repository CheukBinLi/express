package com.express.common.model;

import java.util.List;

/***
 * 
 * @author cheuks-bin.Li
 * @email 20796698@qq.com
 * @date 2017年1月19日
 * @see 物流轨迹即时查询
 */
public class ExpressOrderModel extends BaseExpressModel {

	private static final long serialVersionUID = 1L;
	private String OrderCode;// 订单编号 O
	private String ShipperCode;// 快递公司编码 R
	private String LogisticCode;// 物流单号

	private String EBusinessID;// 用户ID R
	private boolean Success;// 成功与否 R
	private String Reason;// 失败原因 O
	private String State;// 物流状态：2-在途中,3-签收,4-问题件 R
	private List<TracesModel> Traces;// 物流轨迹

	public String getOrderCode() {
		return OrderCode;
	}

	public ExpressOrderModel setOrderCode(String orderCode) {
		OrderCode = orderCode;
		return this;
	}

	public String getShipperCode() {
		return ShipperCode;
	}

	public ExpressOrderModel setShipperCode(String shipperCode) {
		ShipperCode = shipperCode;
		return this;
	}

	public String getLogisticCode() {
		return LogisticCode;
	}

	public ExpressOrderModel setLogisticCode(String logisticCode) {
		LogisticCode = logisticCode;
		return this;
	}

	public String getEBusinessID() {
		return EBusinessID;
	}

	public ExpressOrderModel setEBusinessID(String eBusinessID) {
		EBusinessID = eBusinessID;
		return this;
	}

	public boolean isSuccess() {
		return Success;
	}

	public ExpressOrderModel setSuccess(boolean success) {
		Success = success;
		return this;
	}

	public String getReason() {
		return Reason;
	}

	public ExpressOrderModel setReason(String reason) {
		Reason = reason;
		return this;
	}

	public String getState() {
		return State;
	}

	public ExpressOrderModel setState(String state) {
		State = state;
		return this;
	}

	public List<TracesModel> getTraces() {
		return Traces;
	}

	public ExpressOrderModel setTraces(List<TracesModel> traces) {
		Traces = traces;
		return this;
	}

}
