package com.mvc.controller.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.mvc.controller.Controller;
import com.mvc.exception.BoardException;
import com.mvc.model.board.BoardDAO;
import com.mvc.mybatis.Mybatis;

public class DeleteController implements Controller{
	Mybatis mybatis = Mybatis.getInstance();
	BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		SqlSession sqlSession = mybatis.getSqlSession();
		boardDAO.setSession(sqlSession);
		
		try {
			String board_idx = request.getParameter("board_idx");
			boardDAO.delete(Integer.parseInt(board_idx));
			sqlSession.commit();
		} catch (BoardException e) {
			e.getMessage();
			sqlSession.rollback();
		} finally {
			mybatis.release(sqlSession);
		}
	}
	@Override
	public String getViewName() {
		return "/board/view/delete";
	}
	@Override
	public boolean isForword() {
		return false;
	}
}