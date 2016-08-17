/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.libing.bean.MessageBean;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月19日上午11:28:33
 */
public class TestCase {

    @Ignore
    @Test
    public void testSpring() {

        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

    }

//    @Ignore
    @Test
    public void test1() {

        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

        MessageBean messageBean = ac.getBean("messageBean", MessageBean.class);
        String str = messageBean.execute();
        System.out.println(str);

    }

    @Ignore
    @Test
    public void test2() {

        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

        MessageBean messageBean1 = ac.getBean("messageBean1", MessageBean.class);
        String str = messageBean1.execute();
        System.out.println(str);
    }

}

