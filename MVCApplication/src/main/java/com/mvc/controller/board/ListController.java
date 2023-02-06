package com.mvc.controller.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.mvc.controller.Controller;
import com.mvc.domain.Board;
import com.mvc.model.board.BoardDAO;
import com.mvc.mybatis.Mybatis;

public class ListController implements Controller{
	Mybatis mybatis = Mybatis.getInstance();
	BoardDAO boardDAO = new BoardDAO();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		SqlSession sqlSession = mybatis.getSqlSession();
		boardDAO.setSession(sqlSession);
		
		List<Board> boardList = boardDAO.selectAll();
		
		request.setAttribute("boardList", boardList);
		
		mybatis.release(sqlSession);
	}
	
	@Override
	public String getViewName() {
		return "/board/view/list";
	}
	
	@Override
	public boolean isForword() {
		return true;
	}
}
