package com.express.code.expressimpl.zt;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.express.code.expressimpl.zt.model.ExpressOrderModel;
import com.express.code.util.HttpUtil;
import com.express.code.util.ZTDigesUtil;
import com.express.common.ExpressFactory;
import com.express.common.model.BaseExpressModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ZTImpl implements ExpressFactory<com.express.common.model.ExpressOrderModel> {

	private final Gson GSON = new Gson();

	@Override
	public BaseExpressModel expressOrder(com.express.common.model.ExpressOrderModel baseExpressModel) throws Throwable {
		String requestValue = getTraceInfo("F524A9E86C965F2ED5BF1C8378F2BDDF", "http://japi.zto.cn/zto/api_utf8/traceInterface", "afe5fcb10269423ab18ff27b0b552a68", "TRACES", baseExpressModel);
		Type type = new TypeToken<ExpressOrderModel>() {
		}.getType();
		ExpressOrderModel result = null;
		if (null != requestValue) {
			result = GSON.fromJson(requestValue, type);
		}

		// return result;
		return null;
	}

	@Override
	public BaseExpressModel createElectronicsOrder(com.express.common.model.ExpressOrderModel baseExpressModel) throws Throwable {
		return null;
	}

	public String getTraceInfo(String AppKey, String url, String EBusinessID, String requestType, com.express.common.model.ExpressOrderModel baseExpressModel) {
		// String url = "http://japi.zto.cn/zto/api_utf8/traceInterface";

		ExpressOrderModel expressOrderModel = new ExpressOrderModel();
		expressOrderModel.setBillCodes(baseExpressModel.getLogisticCode().split(","));

		String requestData = GSON.toJson(expressOrderModel);
		// String company_id = "98e86efe304849c890c7bcca5384063a";
		// String key = "F524A9E86C965F2ED5BF1C8378F2BDDF";
		try {
			String data_digest = ZTDigesUtil.instance().digest(requestData, AppKey, "utf-8");
			String response = "";
			Map<String, String> params = new LinkedHashMap<String, String>();
			params.put("data", requestData);
			params.put("company_id", EBusinessID);
			params.put("msg_type", requestType);
			params.put("data_digest", data_digest);
			// 向跟踪信息接口发送请求
//			response = HttpUtil.newInstance().post(url, "UTF-8", params);
			response = HttpUtil.newInstance().sendPost(url, params);
			System.out.println(response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws Throwable {
		// getTraceInfo("['405251767014']");
		new ZTImpl().expressOrder(new com.express.common.model.ExpressOrderModel().setLogisticCode("405251767014,123123123"));
//		new ZTImpl().expressOrder(new com.express.common.model.ExpressOrderModel());
	}

	public static void main1(String[] args) throws Exception {
		Map map = new HashMap();
//		String data = "{\"billCodes\":[\"688888888888\",\"888888888888\"]}";
		String data = "{\"billCodes\":[\"405251767014\",\"123123123\"]}";
		map.put("data", data);
		map.put("msg_type", "TRACES");
		map.put("data_digest", ZTDigesUtil.instance().digest(data, "YOU_KEY", "UTF-8"));
		map.put("company_id", "YOU_COMPANY_ID");

		try {
			System.out.println(HttpUtil.newInstance().sendPost("http://japi.zto.cn/zto/api_utf8/traceInterface", map));
			// System.out.println(HttpUtil.newInstance().post("http://japi.zto.cn/zto/api_utf8/traceInterface", "utf-8", map));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
