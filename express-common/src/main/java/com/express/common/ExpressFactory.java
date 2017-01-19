package com.express.common;

import com.express.common.model.BaseExpressModel;

public interface ExpressFactory {

	/***
	 * 物流轨迹即时查询
	 * 
	 * @param baseExpressModel
	 * @return
	 */
	BaseExpressModel expressOrder(BaseExpressModel baseExpressModel) throws Throwable;

	// BaseModel followingExpressOrder(BaseExpressModel baseExpressModel);

	BaseExpressModel createElectronicsOrder(BaseExpressModel baseExpressModel) throws Throwable;

}
