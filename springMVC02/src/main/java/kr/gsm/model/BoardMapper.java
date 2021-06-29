package kr.gsm.model;

import java.util.List;
// JDBC -> MyBatis : mybatis.org
//@Mapper
public interface BoardMapper {
	// CRUD Method 정의
//	@Select("select * from tb1 board")
	public List<BoardVO> boardList();  // boardList -> SQL Mapper file(XML)
	public int boardInsert(BoardVO vo);
	public BoardVO boardContent(int idx);
	public int boardDelete(int idx);
	public int boardUpdate(BoardVO vo);
}
