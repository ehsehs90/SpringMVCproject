package com.springbook.biz.user.impl;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

public class UserServiceImpl implements UserService{
	private UserDAO userDAO;
	
	
	//UserServiceImpl Ŭ�������� Setter ������ ó���� ���� Setter �޼ҵ尡 �߰��Ǿ���.
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;		
	}
	
	@Override
	public UserVO getUser(UserVO vo) {
		// ############### ���ϰ�!!!!!!!!!!! null �ƴ� �Ф�
		return userDAO.getUser(vo);
	}
	
}
