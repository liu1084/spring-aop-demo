package com.jim.aop;

import com.jim.aop.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
@ContextConfiguration(locations = {"classpath:mvc-dispatcher-servlet.xml"})
public class LogAspectTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private Hello hello;

	@Test
	public void testFoo() {
		this.hello.foo();
	}

	@BeforeTest
	public void setup() {

	}

	@Test
	public void testAddUser() {
		String name = "liujun";
		int age = 10;
		this.hello.addUser(name, age);
	}
}