package com.springbook.biz.user.impl;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

public class UserServiceImpl implements UserService{
	private UserDAO userDAO;
	
	
	//UserServiceImpl 클래스에는 Setter 인젝션 처리를 위한 Setter 메소드가 추가되었다.
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;		
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		// ############### 리턴값!!!!!!!!!!! null 아님 ㅠㅠ
		return userDAO.getUser(vo);
	}
	
}
