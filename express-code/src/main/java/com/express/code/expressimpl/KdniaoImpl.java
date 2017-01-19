package com.express.code.expressimpl;

import java.lang.reflect.Type;

import org.springframework.stereotype.Component;

import com.express.code.util.KdniaoQueryUtil;
import com.express.common.ExpressFactory;
import com.express.common.model.BaseExpressModel;
import com.express.common.model.ExpressOrderModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component("kdniao")
public class KdniaoImpl implements ExpressFactory {

	private final KdniaoQueryUtil kdniaoQueryUtil = KdniaoQueryUtil.newInstance();
	private final Gson gson = new Gson();

	@Override
	public BaseExpressModel expressOrder(BaseExpressModel baseExpressModel) throws Exception {
		String requestValue = kdniaoQueryUtil.kdniaoRequest("末实现", "http://api.kdniao.cc/Ebusiness/EbusinessOrderHandle.aspx", "末实现", "1002", baseExpressModel);
		Type type = new TypeToken<ExpressOrderModel>() {
		}.getType();
		ExpressOrderModel result = null;
		if (null != requestValue) {
			result = gson.fromJson(requestValue, type);
		}
		return result;
	}

	@Override
	public BaseExpressModel createElectronicsOrder(BaseExpressModel baseExpressModel) {
		return null;
	}

}
