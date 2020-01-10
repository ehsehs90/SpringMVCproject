package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		
		//1.Spring �����̳� ����
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� UserServiceImpl ��ü�� Lookup �Ѵ�
		UserService userService = (UserService)container.getBean("userService");
		
		// 3. �α��� ��� �׽�Ʈ
		UserVO vo= new UserVO();
		vo.setId("test");
		vo.setPassword("test123");		
		System.out.println(vo.toString());
		
		UserVO user = userService.getUser(vo);
		//System.out.println(user.toString());
		if(user !=null) {
			System.out.println(user.getName()+"�� ȯ���մϴ�");
		} else {
			System.out.println("�α��ν���");
		}
		
		//4. Spring �����̳ʸ� �����Ѵ�.
		container.close();
	}
}