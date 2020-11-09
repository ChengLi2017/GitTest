package com.vecverse.mao.service;

import com.vecverse.mao.MaoApplicationTests;
import com.vecverse.mao.enums.ResponseEnum;
import com.vecverse.mao.pojo.User;
import com.vecverse.mao.service.IUserService;
import com.vecverse.mao.vo.ResponseVo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IUserServiceTest extends MaoApplicationTests {

    public  static  final String USERNAME = "mao";

    public static final String PASSWORD = "123456";

    @Autowired
    private IUserService iUserService;

    @Test
    public void login() {

        iUserService.login(USERNAME,PASSWORD);



    }
}