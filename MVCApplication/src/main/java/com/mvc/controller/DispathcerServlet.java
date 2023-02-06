package com.mvc.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispathcerServlet extends HttpServlet{
	Properties props; //매핑 정보를 가진 파일을 읽어드릴 객체
	FileInputStream fis;
	
	//요청이 발생하여 서블릿이 생성되는 순간에 매핑정보 load
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		props = new Properties();
		
		/*
		 * context 설정 파일에서 파라미터 정보를 얻어옴
		 * dispatcherServlet 내 파일의 경로나 특정 값이 명시되어서는 안됨
		 * 해당 규칙을 어길 시 코드의 수정이 발생하면 dispatcherServlet도 수정이 필요
		 * */
		String configContextLocation = servletConfig.getInitParameter("configContextLocation");
		String realPath = servletConfig.getServletContext().getRealPath(configContextLocation);
		
		try {
			fis = new FileInputStream(realPath);
			
			props.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}
	
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		//넘겨받은 uri를 통해 해당 컨트롤러 경로 반환
		//경로를 이용해 load해주는 역할
		String controllerPath = props.getProperty(uri);
		try {
			//static 영역에 원본 코드를 로드하여 반환된 class를 인스턴스화
			Class controllerClass = Class.forName(controllerPath);
			Controller controller = (Controller)controllerClass.getDeclaredConstructor().newInstance();
			
			//인터페이스로 정의한 추상 메서드 실행(모든 Controller가 동일한 메서드 사용)
			controller.execute(request, response);
			
			String viewName = controller.getViewName();
			String viewPage = props.getProperty(viewName);
			
			if(controller.isForword()) {
				RequestDispatcher dis = request.getRequestDispatcher(viewPage);
				dis.forward(request, response);
			} else {
				response.sendRedirect(viewPage);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
//		if(uri.equals("/blood.do")) {
//			BloodController bloodController = new BloodController();
//			view = bloodController.execute(request, response);
//		} else if(uri.equals("/movie.do")) {
//			MovieController movieController = new MovieController();
//			view = movieController.handle(request, response);
//		}
	}
	
	//시스템 자원 낭비를 방지하기 위하여 서블릿 생명주기가 닫힐 때 스트림 close
	@Override
	public void destroy() {
		if(fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
