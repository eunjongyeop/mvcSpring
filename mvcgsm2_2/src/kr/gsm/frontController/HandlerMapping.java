package kr.gsm.frontController;

import java.util.HashMap;

import kr.gsm.controller.Controller;
import kr.gsm.controller.MemberContentController;
import kr.gsm.controller.MemberDeleteController;
import kr.gsm.controller.MemberInsertController;
import kr.gsm.controller.MemberListController;
import kr.gsm.controller.MemberRegisterController;
import kr.gsm.controller.MemberUpdateController;

public class HandlerMapping {
	private HashMap<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/memberList.do", new MemberListController());
		mappings.put("/memberDelete.do", new MemberDeleteController());
		mappings.put("/memberInsert.do", new MemberInsertController());
		mappings.put("/memberUpdate.do", new MemberUpdateController());
		mappings.put("/memberContent.do", new MemberContentController());
		mappings.put("/memberRegister.do", new MemberRegisterController());
	}
	
	public Controller getController(String url) {
		return mappings.get(url);
	}
}
/*
		if(command.equals("/memberList.do")) {
			controller = new MemberListController();
		} else if(command.equals("/memberDelete.do")) {
			controller = new MemberDeleteController();
		} else if(command.equals("/memberInsert.do")) {
			controller = new MemberInsertController();
		} else if(command.equals("/memberUpdate.do")) {
			controller = new MemberUpdateController();
		} else if(command.equals("/memberContent.do")) {
			controller = new MemberContentController();
		} else if(command.equals("/memberRegister.do")) {
			controller = new MemberRegisterController();
} // -------------------------------------------
*/