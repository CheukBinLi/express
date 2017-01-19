package com.express.common.model;

import java.io.Serializable;

public class CommodityModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String GoodsName;// 商品名称 R
	private String GoodsCode;// 商品编码 O
	private String Goodsquantity;// Int 商品数量 O
	private double GoodsPrice; // 商品价格 O
	private String GoodsWeight;// 商品重量 O
	private String GoodsDesc;// 商品描述 O
	private String GoodsVol;// 商品体积m3 O

	public String getGoodsName() {
		return GoodsName;
	}

	public CommodityModel setGoodsName(String goodsName) {
		GoodsName = goodsName;
		return this;
	}

	public String getGoodsCode() {
		return GoodsCode;
	}

	public CommodityModel setGoodsCode(String goodsCode) {
		GoodsCode = goodsCode;
		return this;
	}

	public String getGoodsquantity() {
		return Goodsquantity;
	}

	public CommodityModel setGoodsquantity(String goodsquantity) {
		Goodsquantity = goodsquantity;
		return this;
	}

	public double getGoodsPrice() {
		return GoodsPrice;
	}

	public CommodityModel setGoodsPrice(double goodsPrice) {
		GoodsPrice = goodsPrice;
		return this;
	}

	public String getGoodsWeight() {
		return GoodsWeight;
	}

	public CommodityModel setGoodsWeight(String goodsWeight) {
		GoodsWeight = goodsWeight;
		return this;
	}

	public String getGoodsDesc() {
		return GoodsDesc;
	}

	public CommodityModel setGoodsDesc(String goodsDesc) {
		GoodsDesc = goodsDesc;
		return this;
	}

	public String getGoodsVol() {
		return GoodsVol;
	}

	public CommodityModel setGoodsVol(String goodsVol) {
		GoodsVol = goodsVol;
		return this;
	}

}
