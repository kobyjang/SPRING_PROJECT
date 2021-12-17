package co.micol.potal.board.service;


import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BoardMapper {
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	void boardHit(int n);
	List<BoardVO> boardSearchList(@Param("key") String key, @Param("val") String val); //
	void boardNoupdate(int n); // 글 삭제후 번호를 맞추기 위함.
}
