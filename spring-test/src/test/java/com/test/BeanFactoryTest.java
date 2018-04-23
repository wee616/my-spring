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
		//wuyc XmlBeanFactory的入参为Resource，ClassPathResource实现了Resource接口
		//wuyc Resource接口抽象了所有spring内部使用到的底层资源：File、URL、Classpath等
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring/spring-base.xml"));
		//2.定义testBean，指向实例化的bean
		MyTestBean testBean = (MyTestBean)bf.getBean("myTestBean");
		//3.调用testBean
		testBean.setTest("hello world");
		System.out.println(testBean.getTest());
	}
}
