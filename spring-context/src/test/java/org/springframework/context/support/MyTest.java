package org.springframework.context.support;

import org.junit.jupiter.api.Test;

public class MyTest {

	private static final String PATH = "/org/springframework/context/support/";

	@Test
	public void testSingleConfigLocationBean() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(PATH + "ApplicationContext.xml");
		User user = (User) ctx.getBean("user");
		System.out.println(user);
	}
}
