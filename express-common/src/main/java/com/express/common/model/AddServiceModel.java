package com.express.common.model;

import java.io.Serializable;

public class AddServiceModel implements Serializable, ServiceModelType {

	private static final long serialVersionUID = 1L;
	private String Name;// 增值服务名称 O
	private String Value;// 增值服务值 O
	private String CustomerID;// 客户标识（选填） O

	public String getName() {
		return Name;
	}

	public AddServiceModel setName(String name) {
		Name = name;
		return this;
	}

	public String getValue() {
		return Value;
	}

	public AddServiceModel setValue(String value) {
		Value = value;
		return this;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public AddServiceModel setCustomerID(String customerID) {
		CustomerID = customerID;
		return this;
	}

}
