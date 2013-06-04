package com.mengqiu.dao;


import com.mengqiu.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM UserTable where email = #{email}")
    User getUserByEmail(String email);
}
