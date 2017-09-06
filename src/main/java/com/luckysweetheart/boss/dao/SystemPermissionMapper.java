package com.luckysweetheart.boss.dao;

import com.luckysweetheart.boss.entity.SystemPermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SystemPermissionMapper {
    int deleteByPrimaryKey(Long permissionId);

    int insert(SystemPermission record);

    int insertSelective(SystemPermission record);

    SystemPermission selectByPrimaryKey(Long permissionId);

    int updateByPrimaryKeySelective(SystemPermission record);

    int updateByPrimaryKey(SystemPermission record);
}