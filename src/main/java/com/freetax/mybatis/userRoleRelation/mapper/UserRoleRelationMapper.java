package com.freetax.mybatis.userRoleRelation.mapper;

import com.freetax.mybatis.userRoleRelation.entity.UserRoleRelation;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleRelation record);

    int insertSelective(UserRoleRelation record);

    UserRoleRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRoleRelation record);

    int updateByPrimaryKey(UserRoleRelation record);

    Integer selectRoleidByUserid(Integer userid);

    void deleteRelationsbyUserid(int[] userids);

    void deleteRelationsbyRoleid(int[] roleids);

    int updateByUserid(UserRoleRelation relation);

}