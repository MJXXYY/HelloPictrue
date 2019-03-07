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
	* 通过id获取数据
	*/
	public User findById(String id)throws Exception{
		return (User)dao.selectByPrimaryKey(Integer.parseInt(id));
	}

}
