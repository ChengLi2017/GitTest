package com.vecverse.mao.service;

import com.vecverse.mao.pojo.User;
import com.vecverse.mao.vo.ResponseVo;


public interface IUserService {

	/**
	 * 注册
	 */
	ResponseVo<User> register(User user);

	/**
	 * 登录
	 */
	ResponseVo<User> login(String username, String password);
}
