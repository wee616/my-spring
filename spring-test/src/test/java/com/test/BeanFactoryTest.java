package com.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad(){
		//1.读取xml文件，实例化bean
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring/spring-base.xml"));
		//2.定义testBean，指向实例化的bean
		MyTestBean testBean = (MyTestBean)bf.getBean("myTestBean");
		//3.调用testBean
		testBean.setTest("hello world");
		System.out.println(testBean.getTest());
	}
}
