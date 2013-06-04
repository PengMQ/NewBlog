package com.mengqiu.dao;


import com.mengqiu.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserMapperTest extends IntegrationTest{
    @Autowired
    UserMapper userMapper;

    @Test
    public void shouldSaveUserToDatabase() throws Exception {
        User testUser = userMapper.getUserByEmail("pmqapril@163.com");
        assertThat(testUser.getName(), is("nana"));



    }
}
