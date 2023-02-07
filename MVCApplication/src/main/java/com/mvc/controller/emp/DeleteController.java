package com.mvc.controller.emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.controller.Controller;
import com.mvc.model.emp.EmpService;

public class DeleteController implements Controller{
	EmpService empService;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		empService = new EmpService();
		
		empService.delete(Integer.parseInt(request.getParameter("empno")));
	}
	
	@Override
	public String getViewName() {
		return "/emp/view/delete";
	}
	
	@Override
	public boolean isForword() {
		return false;
	}
}
