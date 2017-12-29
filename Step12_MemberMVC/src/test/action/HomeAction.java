package test.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class HomeAction extends Action {

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) {
		//DB에서 공지사항을 읽어온다.
		List<String> news=new ArrayList<>();
		news.add("오늘 날씨가 춥네요!");
		news.add("감기 조심 하세용");
		news.add("MVC 패턴 공부중");
		news.add("어쩌구 저쩌구 졸립당");
		//request 에 담는다.
		request.setAttribute("news", news);
		//home.jsp 페이지로 forward 이동해서 응답할 수 있도록
		ActionForward af=new ActionForward("/views/home.jsp");
		//리턴
		return af;
	}

}
