package su.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import su.member.control.Controller;
import su.member.dao.MemberDAO;
import su.member.dto.MemberDTO;
import su.member.handler.MemberHandlerAdapter;

public class MemberDeleteController implements Controller {
	private static Log log = LogFactory.getLog(MemberDeleteController.class);

	@Override
	public MemberHandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		int member_number = Integer.parseInt(request.getParameter("member_number"));
		
		MemberDAO memberDAO = new MemberDAO();
		
		memberDAO.memberDelete(member_number);

		return null;
	}

}
