package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.BloodAdvisor;

public class BloodController implements Controller{
	String controllerName = this.getClass().getName();
	BloodAdvisor bloodAdvisor = new BloodAdvisor();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String result = bloodAdvisor.getAdvice(request.getParameter("blood"));
		request.setAttribute("result", result);
	}
	
	@Override
	public String getViewName() {
		return "/blood/view";
	}
	@Override
	public boolean isForword() {
		return true;
	}
}
