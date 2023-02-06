package com.mvc.controller.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.mvc.controller.Controller;
import com.mvc.domain.Board;
import com.mvc.exception.BoardException;
import com.mvc.model.board.BoardDAO;
import com.mvc.mybatis.Mybatis;

public class RegistController implements Controller{
	Mybatis mybatis = Mybatis.getInstance();
	BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		SqlSession sqlSession = mybatis.getSqlSession();
		boardDAO.setSession(sqlSession);
		
		Board board = new Board();
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContent(request.getParameter("content"));
		
		try {
			boardDAO.insert(board);
			sqlSession.commit();
		} catch (BoardException e) {
			System.out.println(e.getMessage());
			sqlSession.rollback();
		} finally {
			mybatis.release(sqlSession);
		}
	}
	
	@Override
	public String getViewName() {
		return "/board/view/regist";
	}
	
	@Override
	public boolean isForword() {
		return false;
	}
}
