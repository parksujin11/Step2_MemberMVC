package test.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class MemberInsertFormAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) {
		//view 페이지의 정보를 담고
		ActionForward af=new ActionForward("/views/member/insertform.jsp");
		//리턴해 준다.
		return af;
	}

}
