package kr.gsm.frontController;

public class ViewResolver {
	public static String makeView(String view) {
		return "/WEB-INF/member/"+view+".jsp";
	}
}
