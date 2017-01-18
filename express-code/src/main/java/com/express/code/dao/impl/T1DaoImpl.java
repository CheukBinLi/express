package com.express.code.dao.impl;

import com.express.code.entity.T1;
import com.express.code.dao.T1Dao;
import com.express.code.dao.impl.T1DaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cheuks.bin.original.common.dbmanager.DBAdapter;
import com.cheuks.bin.original.common.dbmanager.dao.AbstractDao;

@Component
public class T1DaoImpl extends AbstractDao<T1, Integer> implements T1Dao {

	@Autowired
	private DBAdapter<?> dBAdapter;

	@Override
	public Class<T1> getEntityClass() {
		return T1.class;
	}

	@Override
	public DBAdapter<?> getDBAdapter() {
		return dBAdapter;
	}

}
