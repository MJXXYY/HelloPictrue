package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserMapper;
import model.User;

@Service("userService")
public class UserService {
	@Resource
	private UserMapper dao;
	/*
	* ͨ��id��ȡ����
	*/
	public User findById(String id)throws Exception{
		return (User)dao.selectByPrimaryKey(Integer.parseInt(id));
	}

}
