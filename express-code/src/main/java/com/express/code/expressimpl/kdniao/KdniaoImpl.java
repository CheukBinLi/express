package com.express.code.expressimpl.kdniao;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.express.code.util.HttpUtil;
import com.express.code.util.KdniaoDigestUtil;
import com.express.common.ExpressFactory;
import com.express.common.model.BaseExpressModel;
import com.express.common.model.ExpressOrderModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component("kdniao")
public class KdniaoImpl implements ExpressFactory {

	private final KdniaoDigestUtil kdniaoQueryUtil = KdniaoDigestUtil.newInstance();
	private final Gson GSON = new Gson();

	@Override
	public BaseExpressModel expressOrder(BaseExpressModel baseExpressModel) throws Exception {
		String requestValue = kdniaoRequest("末实现", "http://api.kdniao.cc/Ebusiness/EbusinessOrderHandle.aspx", "末实现", "1002", baseExpressModel);
		Type type = new TypeToken<ExpressOrderModel>() {
		}.getType();
		ExpressOrderModel result = null;
		if (null != requestValue) {
			result = GSON.fromJson(requestValue, type);
		}
		return result;
	}

	@Override
	public BaseExpressModel createElectronicsOrder(BaseExpressModel baseExpressModel) {
		return null;
	}

	public String kdniaoRequest(String AppKey, String url, String EBusinessID, String requestType, BaseExpressModel baseExpressModel) throws Exception {
		String requestData = GSON.toJson(baseExpressModel);

		Map<String, String> params = new HashMap<String, String>();
		params.put("RequestData", kdniaoQueryUtil.urlEncoder(requestData, "UTF-8"));
		params.put("EBusinessID", EBusinessID);
		params.put("RequestType", requestType);
		String dataSign = kdniaoQueryUtil.encrypt(requestData, AppKey, "UTF-8");
		params.put("DataSign", kdniaoQueryUtil.urlEncoder(dataSign, "UTF-8"));
		params.put("DataType", "2");

		String result = HttpUtil.newInstance().sendPost(url, params);

		// 根据公司业务处理返回的信息......

		return result;
	}

}
