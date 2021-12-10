package org.zerock.mapper.project01;

import java.util.List;

import org.zerock.domain.project01.BoardVO;

public interface BoardMapper {

	
	public List<BoardVO> getList();//모든 게시물 조회
	
	public int insert(BoardVO board);// get generated key
	
	public BoardVO read(Integer id);// id로 하나의 게시물 조회
	
	
	public int delete(Integer id); //게시물 삭제
	
	public int update(BoardVO board);// 업데이트
}
