package com.express.common.model;

public interface ServiceModelType {
	
	String PACK_CHARGES = "PACK_CHARGES";// 包装费(单位:分)
	String PREMIUM = "PREMIUM";// 保险费(单位:分)
	String ORDER_SUM = "ORDER_SUM";// 订单总金额(单位:分)
	String COLLECT_SUM = "COLLECT_SUM";// 到达收取金额，一般代收货款或者到付件才需指定(单位:分)collectSum
	String PRICE = "PRICE";// 订单包裹中商品总价值
	String SENDER_ID = "SENDER_ID";// 订单包裹中商品总价值
	String RECEIVER_ID = "RECEIVER_ID";// 订单包裹中商品总价值
	
}
