package org.zerock.mapper.project01;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.project01.BoardVO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {

	
	@Autowired
	public BoardMapper mapper;
	
	@Test
	public void mapperTest() {
		assertNotNull(mapper);
	}

//	@Test
//	public void insertTest() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("test 제목");
//		board.setContent("test 내용");
//		board.setWriter("test 쓴이");
//	
//	int cnt = mapper.insert(board);
//	assertEquals(1, cnt);
//	}
	
	@Test
	public void getlisttest() {
	List<BoardVO> list =mapper.getList();
		assertNotNull(list);
	}
	@Test
	public void readtest() {
	BoardVO board=mapper.read(1);
	assertEquals(1, (int)board.getId());
	
	
	}
	@Test
	public void deletetest() {
		int c =mapper.delete(5);
		assertEquals(1, c);
		
	}
	
	@Test
	public void updateTest() {
		BoardVO board = new BoardVO();
		board.setId(1);
		board.setTitle("first");
		board.setContent("con");
		board.setWriter("min");
		int c =mapper.update(board);
		assertEquals(1, c);	
	}
	
	
	
	
	
}
