package com.vecverse.mao.dao;

import com.vecverse.mao.pojo.EUser;

public interface EUserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(EUser record);

    int insertSelective(EUser record);

    EUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(EUser record);

    int updateByPrimaryKey(EUser record);
}