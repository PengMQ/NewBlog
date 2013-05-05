package com.mengqiu.service;

import com.mengqiu.domain.Email;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:testApplicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmailTest {

    private Email email;


    @Before
    public void setUp() throws Exception {
        email = new Email("from@163.com", "to@163.com");

    }

    @Test
    public void shouldGetEmailFromAddress() throws Exception {
        assertThat(email.getFromAddress(), is("from@163.com"));

    }

    @Test
    public void shouldGetEmailToAddress() throws Exception {
        assertThat(email.getToAddress(), is("to@163.com"));

    }
}
