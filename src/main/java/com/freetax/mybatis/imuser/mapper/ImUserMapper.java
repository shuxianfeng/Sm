package com.freetax.mybatis.imuser.mapper;

import com.freetax.mybatis.imuser.entity.ImUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ImUserMapper {
    int insert(ImUser record);

    int insertSelective(ImUser record);

    ImUser selectByUserid(@Param("userid") Integer id, @Param("type") Integer type);

    List<ImUser> selectAllAPPImuser();


}