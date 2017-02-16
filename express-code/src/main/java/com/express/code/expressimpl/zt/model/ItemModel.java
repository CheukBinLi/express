package com.express.code.expressimpl.zt.model;

import java.io.Serializable;

public class ItemModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;// String(32)货品IDY
	private String name;// String(32)货品名称Y
	private String category;// String(32)商品分类Y
	private String material;// String(32)商品材质Y
	private double size;// String(32)大小（长,宽,高）(单位：厘米), 用半角的逗号来分隔长宽高Y
	private double weight;// LONG重量（单位：克)Y
	private double unitprice;// LONG单价(单位:分)Y
	private int quantity;// NUMBER货品数量Y
	private String remark;// String(64)货品备注Y

	public String getId() {
		return id;
	}

	public ItemModel setId(String id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public ItemModel setName(String name) {
		this.name = name;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public ItemModel setCategory(String category) {
		this.category = category;
		return this;
	}

	public String getMaterial() {
		return material;
	}

	public ItemModel setMaterial(String material) {
		this.material = material;
		return this;
	}

	public double getSize() {
		return size;
	}

	public ItemModel setSize(double size) {
		this.size = size;
		return this;
	}

	public double getWeight() {
		return weight;
	}

	public ItemModel setWeight(double weight) {
		this.weight = weight;
		return this;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public ItemModel setUnitprice(double unitprice) {
		this.unitprice = unitprice;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public ItemModel setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public ItemModel setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	public ItemModel(String id, String name, String category, String material, double size, double weight, double unitprice, int quantity, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.material = material;
		this.size = size;
		this.weight = weight;
		this.unitprice = unitprice;
		this.quantity = quantity;
		this.remark = remark;
	}

	public ItemModel() {
		super();
	}

}
