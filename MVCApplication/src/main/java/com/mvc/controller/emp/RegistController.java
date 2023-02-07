package com.mvc.controller.emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.controller.Controller;
import com.mvc.domain.Dept;
import com.mvc.domain.Emp;
import com.mvc.model.emp.EmpService;

public class RegistController implements Controller{
	EmpService empService;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		empService = new EmpService();
		
		//empty dept instance
		Dept dept = new Dept();
		dept.setDname(request.getParameter("dname"));
		
		//empty emp instance
		Emp emp = new Emp();
		emp.setEname(request.getParameter("ename"));
		emp.setSal(Integer.parseInt(request.getParameter("sal")));
		emp.setDept(dept);
		
		empService.empRegist(emp);
	}
	@Override
	public String getViewName() {
		return "/emp/view/regist";
	}
	@Override
	public boolean isForword() {
		return false;
	}
}
