package com.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class ApplicationContextTest {

	@Test
	public void testSimpleLoad(){
		//1.读取xml文件，实例化bean
		//wuyc 入参支持以数组方式传入，解析的功能在refresh()中实现
		//wuyc ApplicationContext继承了BeanFactory，实现了BeanFactory的所有功能，并且进行了扩展
		ApplicationContext bf = new ClassPathXmlApplicationContext("spring/spring-base.xml");
		//2.定义testBean，指向实例化的bean
		MyTestBean testBean = (MyTestBean)bf.getBean("myTestBean");
		//3.调用testBean
		testBean.setTest("hello world");
		System.out.println(testBean.getTest());
	}
}
