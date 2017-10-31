package com.freetax.mybatis.user.mapper;

import com.freetax.mybatis.user.entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    LoginUser selectLoginUserByToken(@Param("token") String token);

    LoginUser selectLoginuserByUserid(@Param("id") Integer id);

}