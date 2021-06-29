package kr.gsm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.gsm.model.BoardMapper;
import kr.gsm.model.BoardVO;

@Controller
public class BoardController {
	
	@Autowired
	private BoardMapper mapper;	// DI(의존성 주입)
	// 계시판 리스트 가져오기(/boardList.do)
	@RequestMapping("/boardList.do")			// URL : http://localhost:8080/web/boardList.do
	public String boardList(Model model) {
		List<BoardVO> list = mapper.boardList();
		model.addAttribute("list", list);
		
		return "boardList";
	} 	 	
	
	@RequestMapping("/registerForm.do")
	public String registerForm() {
		return "boardForm";	// boardForm.jsp
	}
	
	@RequestMapping("/register.do")
	public String register(BoardVO vo) {
		mapper.boardInsert(vo);
		
		return "redirect:boardList.do";
	}
	
	@RequestMapping("/content.do")
	public String content(@RequestParam("idx") int idx, Model model) {
		BoardVO vo = mapper.boardContent(idx);
		model.addAttribute("vo", vo);
		return "boardContent";  // boardContent.jsp
	}
	
	@RequestMapping("/boardDelete.do")
	public String boardDelete(int idx) {
		mapper.boardDelete(idx);
		
		return "redirect:boardList.do";
	}
	
	@RequestMapping("boardUpdate")
	public String boardUpdate(BoardVO vo) {
		mapper.boardUpdate(vo);
		
		return "redirect:boardList.do";
	}
}
