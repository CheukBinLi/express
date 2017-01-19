package com.express.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.express.code.entity.T1;
import com.express.code.service.T1Service;
import com.express.common.ExpressFactory;
import com.express.common.model.BaseExpressModel;
import com.express.common.model.ExpressOrderModel;
import com.google.gson.Gson;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class ExpressController {

	@Autowired
	private T1Service t1Service;

	@Autowired
	private ExpressFactory expressFactory;

	public ExpressController() {
		super();
		System.err.println("ExpressController");
	}

	@RequestMapping(value = { "{path}" }, method = { RequestMethod.GET })
	public ModelAndView basePath(HttpServletRequest request, HttpServletResponse response, @PathVariable("path") String path) throws IOException {
		return new ModelAndView(path);
	}

	@RequestMapping(value = { "test" }, method = { RequestMethod.GET })
	public void testPath(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		T1 t1 = new T1();
		t1.setName("a");
		t1Service.save(t1);
		// request.getSession().setAttribute("a", "a");
		response.getOutputStream().write(("this is testPathController:count" + t1Service.getCount(null)).getBytes());
	}

	@RequestMapping(value = { "expressOrder" }, method = { RequestMethod.GET })
	public void expressOrder(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		BaseExpressModel baseExpressModel = expressFactory.expressOrder(new ExpressOrderModel().setShipperCode("ZT").setLogisticCode("110AAAAAAAAAA123123132"));

		response.getOutputStream().write(("result:" + new Gson().toJson(baseExpressModel)).getBytes());
	}

}
