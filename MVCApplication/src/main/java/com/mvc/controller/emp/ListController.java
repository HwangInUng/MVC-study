package com.mvc.controller.emp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.controller.Controller;
import com.mvc.domain.Emp;
import com.mvc.model.emp.EmpService;

public class ListController implements Controller{
	EmpService empService;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		empService = new EmpService();
		
		List<Emp> empList = empService.selectAll();
		request.setAttribute("empList", empList);
	}
	@Override
	public String getViewName() {
		return "/emp/view/list";
	}
	@Override
	public boolean isForword() {
		return true;
	}
}
