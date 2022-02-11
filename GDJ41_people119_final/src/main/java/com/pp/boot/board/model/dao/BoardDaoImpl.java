package com.pp.boot.board.model.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.pp.boot.board.model.vo.Board;
import com.pp.boot.board.model.vo.Comment;
import com.pp.boot.board.model.vo.Like;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Override
	public List<Board> boardList(SqlSessionTemplate session) {
		
		return session.selectList("board.selectBoardList"); 
	}

	@Override
	public int boardListCount(SqlSessionTemplate session) {
		
		return session.selectOne("board.boardListCount");
	}

	@Override
	public List<Board> freeList(SqlSessionTemplate session) {
		// TODO Auto-generated method stub
		return session.selectList("board.selectfreeList");
	}

	@Override
	public List<Board> leaveList(SqlSessionTemplate session) {
		// TODO Auto-generated method stub
		return session.selectList("board.selectleaveList");
	}

	@Override
	public List<Board> qaList(SqlSessionTemplate session) {
		// TODO Auto-generated method stub
		return session.selectList("board.selectqaList");
	}

	@Override
	public List<Board> readyList(SqlSessionTemplate session) {
		// TODO Auto-generated method stub
		return session.selectList("board.selectreadyList");
	}

	@Override
	public List<Board> turnoverList(SqlSessionTemplate session) {
		// TODO Auto-generated method stub
		return session.selectList("board.selectturnoverList");
	}

	@Override
	public Board selectBoard(SqlSessionTemplate session, int boardNo) {
		// TODO Auto-generated method stub
		return session.selectOne("board.selectBoard",boardNo);
	}
	@Override
	public List<Comment> commentList(SqlSessionTemplate session,int boardNo) {
		// TODO Auto-generated method stub
		return session.selectList("board.commentList",boardNo);
	}
	@Override
	public int insertComment(SqlSessionTemplate session, Comment c) {
		// TODO Auto-generated method stub
		return session.insert("board.insertComment",c);
	}

	@Override
	public int countComment(SqlSessionTemplate session, int boardNo) {
		// TODO Auto-generated method stub
		return session.selectOne("board.countComment",boardNo);
	}
	@Override
	public List<Board> boardCategory(SqlSessionTemplate session, String category) {
		// TODO Auto-generated method stub
		return session.selectList("board.boardCategory",category);
	}

	@Override
	public int categoryListCount(SqlSessionTemplate session, String category) {
		// TODO Auto-generated method stub
		return session.selectOne("board.categoryListCount",category);
	}

	@Override
	public int enrollBoard(SqlSessionTemplate session, Board b) {
		// TODO Auto-generated method stub
		return session.insert("board.enrollBoard",b);
	}

	@Override
	public int boardLike(SqlSessionTemplate session, Like l) {
		// TODO Auto-generated method stub
		return session.insert("board.boardLike",l);				
	}

	@Override
	public int boardLikeCount(SqlSessionTemplate session, Like l) {
		// TODO Auto-generated method stub
		return session.selectOne("board.boardLikeCount",l);
	}

	@Override
	public List<Board> hotList(SqlSessionTemplate session) {
		// TODO Auto-generated method stub
		return session.selectList("board.hotList");
	}

	@Override
	public int insertReply(SqlSessionTemplate session, Comment c) {
		// TODO Auto-generated method stub
		return session.insert("board.insertReply",c);
	}

	@Override
	public List<Comment> replyList(SqlSessionTemplate session, int boardNo) {
		// TODO Auto-generated method stub
		return session.selectList("board.replyList",boardNo);
	}

	@Override
	public int commentDelete(SqlSessionTemplate session, int commentNo) {
		// TODO Auto-generated method stub
		return session.delete("board.commentDelete",commentNo);
	}

	@Override
	public int boardDelete(SqlSessionTemplate session, int boardNo) {
		// TODO Auto-generated method stub
		return session.delete("board.boardDelete",boardNo);
	}

	@Override
	public Board updateBoardView(SqlSessionTemplate session, int boardNo) {
		// TODO Auto-generated method stub
		return session.selectOne("board.updateBoardView",boardNo);
	}

	@Override
	public int updateBoard(SqlSessionTemplate session, Board b) {
		// TODO Auto-generated method stub
		return session.update("board.updateBoard",b);
	}

	@Override
	public List<Board> newSort(SqlSessionTemplate session, String category) {
		// TODO Auto-generated method stub
		return session.selectList("board.newSort",category);
	}

	@Override
	public List<Board> viewSort(SqlSessionTemplate session, String category) {
		// TODO Auto-generated method stub
		return session.selectList("board.viewSort",category);
	}

	@Override
	public void updateViewCount(SqlSessionTemplate session, int boardNo) {
		session.update("board.updateViewCount",boardNo);
	}

	@Override
	public List<Board> likeSort(SqlSessionTemplate session, String category) {
		// TODO Auto-generated method stub
		return session.selectList("board.likeSort",category);
	}

	@Override
	public List<Board> commentSort(SqlSessionTemplate session, String category) {
		// TODO Auto-generated method stub
		return session.selectList("board.commentSort",category);
	}
	
	
	
	
}
