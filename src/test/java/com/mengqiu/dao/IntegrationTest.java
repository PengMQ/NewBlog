package com.mengqiu.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:testApplicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class IntegrationTest extends AbstractTransactionalJUnit4SpringContextTests {

}
