package com.test.aopTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

	@Test
	public void aopTest(){
		ApplicationContext bf = new ClassPathXmlApplicationContext("spring/spring-base.xml");
		IhelloWorld helloWorld = (IhelloWorld)bf.getBean("helloWorld");
		helloWorld.printHelloWorld();
	}
}
