package su.member.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import su.member.control.Controller;
import su.member.controller.MemberSelectController;
import su.member.controller.MemberSelectDetailController;
import su.member.handler.MemberHandlerAdapter;

public class MemberDispatcherServlet extends HttpServlet {
	private static Log log = LogFactory.getLog(MemberDispatcherServlet.class);

	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String pathURL = requestURI.substring(contextPath.length());
		
		log.info("매핑명 조회 - " + pathURL);
		
		MemberHandlerAdapter memberHandlerAdapter = null;
		
		Controller controller = null;
		
		if(pathURL.equals("/MemberSelect.me")){
			controller = new MemberSelectController();
			memberHandlerAdapter = controller.execute(request, response);			
			
			log.info("회원 전체 조회 확인 - " + memberHandlerAdapter);
		}
		
		else if(pathURL.equals("/MemberSelectDetail.me")) {
			controller = new MemberSelectDetailController();
			memberHandlerAdapter = controller.execute(request, response);
			
			log.info("회원 상세 조회 확인 - " + memberHandlerAdapter);
		}
		
		
		
		
		
		
		
		
		if(memberHandlerAdapter != null) {
			if(memberHandlerAdapter.isRedirect()) {
				response.sendRedirect(memberHandlerAdapter.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(memberHandlerAdapter.getPath());
				dispatcher.forward(request, response);
			}
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
