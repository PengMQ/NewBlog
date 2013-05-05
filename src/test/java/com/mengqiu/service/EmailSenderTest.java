package com.mengqiu.service;


import com.mengqiu.domain.Email;
import com.mengqiu.domain.User;
import com.mengqiu.service.Email.EmailGenerator;
import com.mengqiu.service.Email.EmailSender;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jvnet.mock_javamail.Mailbox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.Message;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:testApplicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmailSenderTest {

    User user;
    Email email;

    @Autowired
    private EmailSender emailSender;
    private EmailGenerator emailGenerator;



    @Before
    public void setUp() throws Exception {
        user = new User("nana");
        email = new Email("from@163.com", "to@163.com");

    }

    @Test
    public void ShouldSendEmailWithoutException() throws Exception {
        emailSender.send(email, user);

        List<Message> inbox = Mailbox.get("to@163.com");
        assertThat(inbox.size(), is(1));
        assertThat(inbox.get(0).getSubject(), is("Welcome nana to Blog"));
        assertThat(inbox.get(0).getContent().toString(), containsString("亲爱的nana:"));

    }
}
