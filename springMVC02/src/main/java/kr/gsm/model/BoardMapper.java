package kr.gsm.model;

import java.util.List;
// JDBC -> MyBatis : mybatis.org
//@Mapper
public interface BoardMapper {
	// CRUD Method 정의
//	@Select("select * from tb1 board")
	public List<BoardVO> boardList();  // boardList -> SQL Mapper file(XML)
	public int boardInsert(BoardVO vo);
}
