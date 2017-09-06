package com.luckysweetheart.boss.dao;

import com.luckysweetheart.boss.entity.SystemRole;

public interface SystemRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(SystemRole record);

    int insertSelective(SystemRole record);

    SystemRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SystemRole record);

    int updateByPrimaryKey(SystemRole record);
}