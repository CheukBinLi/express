package com.express.common;

import com.express.common.model.BaseExpressModel;

public interface ExpressFactory<T extends BaseExpressModel> {

	/***
	 * 物流轨迹即时查询
	 * 
	 * @param baseExpressModel
	 * @return
	 */
	BaseExpressModel expressOrder(T baseExpressModel) throws Throwable;

	// BaseModel followingExpressOrder(BaseExpressModel baseExpressModel);

	BaseExpressModel createElectronicsOrder(T baseExpressModel) throws Throwable;

}
