package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;


@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
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
