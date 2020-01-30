package com.springbook.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping("login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println("�α��� ó��");
		UserVO user = userDAO.getUser(vo);

		if (userDAO.getUser(vo) != null) {
			System.out.println("����..");
			return "redirect:getBoardList.do";
		} else {
			return "login.jsp";

		}
	}
}
