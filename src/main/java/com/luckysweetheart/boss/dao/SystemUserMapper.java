package com.luckysweetheart.boss.dao;

import com.luckysweetheart.boss.entity.SystemUser;

public interface SystemUserMapper {
    int deleteByPrimaryKey(Long bossUserId);

    int insert(SystemUser record);

    int insertSelective(SystemUser record);

    SystemUser selectByPrimaryKey(Long bossUserId);

    int updateByPrimaryKeySelective(SystemUser record);

    int updateByPrimaryKey(SystemUser record);
}