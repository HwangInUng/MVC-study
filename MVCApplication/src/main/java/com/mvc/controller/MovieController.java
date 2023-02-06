package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.model.MovieAdvisor;

public class MovieController implements Controller{
	String controllerName = this.getClass().getName();
	MovieAdvisor movieAdvisor = new MovieAdvisor();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String result = movieAdvisor.getAdvice(request.getParameter("movie"));
		request.setAttribute("result", result);
	}
	
	@Override
	public String getViewName() {
		return "/movie/view";
	}
	@Override
	public boolean isForword() {
		return true;
	}
}
