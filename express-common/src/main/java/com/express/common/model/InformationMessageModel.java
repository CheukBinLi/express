package com.express.common.model;

public class InformationMessageModel extends BaseModel {

	private static final long serialVersionUID = 1L;
	private BaseExpressModel RequestData;// 请求内容需进行URL(utf-8)编码。请求内容JSON格式，须和DataType一致。 R
	private String EBusinessID;// 商户ID，请在我的服务页面查看。 R
	private String RequestType; // 请求指令类型：1002 R
	private String DataSign;// 数据内容签名：把(请求内容(未编码)+AppKey)进行MD5加密，然后Base64编码，最后 进行URL(utf-8)编码。详细过程请查看Demo。 R
	private String DataType;// 请求、返回数据类型：2-json；

	public BaseExpressModel getRequestData() {
		return RequestData;
	}

	public InformationMessageModel setRequestData(BaseExpressModel requestData) {
		RequestData = requestData;
		return this;
	}

	public String getEBusinessID() {
		return EBusinessID;
	}

	public InformationMessageModel setEBusinessID(String eBusinessID) {
		EBusinessID = eBusinessID;
		return this;
	}

	public String getRequestType() {
		return RequestType;
	}

	public InformationMessageModel setRequestType(String requestType) {
		RequestType = requestType;
		return this;
	}

	public String getDataSign() {
		return DataSign;
	}

	public InformationMessageModel setDataSign(String dataSign) {
		DataSign = dataSign;
		return this;
	}

	public String getDataType() {
		return DataType;
	}

	public InformationMessageModel setDataType(String dataType) {
		DataType = dataType;
		return this;
	}

}
