package com.express.code.service.impl;

import com.express.code.dao.T1Dao;
import com.express.code.entity.T1;
import com.express.code.service.T1Service;
import com.express.code.service.impl.T1ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cheuks.bin.original.common.dbmanager.dao.BaseDao;
import com.cheuks.bin.original.common.dbmanager.service.AbstractService;

@Component
public class T1ServiceImpl extends AbstractService<T1, Integer> implements T1Service {

	@Autowired
	private T1Dao t1Dao;

	@Override
	public BaseDao<T1, Integer> getService() {
		return t1Dao;
	}

}
