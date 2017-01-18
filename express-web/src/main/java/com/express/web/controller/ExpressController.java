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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.express.code.entity.T1;
import com.express.code.service.T1Service;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class ExpressController {

	@Autowired
	private T1Service t1Service;

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
//		request.getSession().setAttribute("a", "a");
		response.getOutputStream().write(("this is testPathController:count" + t1Service.getCount(null)).getBytes());
	}
}
