package com.jim.aop.service.impl;

import com.jim.aop.service.Hello;
import org.springframework.stereotype.Component;

/**
 * Created by jim on 2017/8/29.
 * This class is ...
 */
@Component("hello")
public class HelloImpl implements Hello {
	@Override
	public String foo() {
		System.out.println("call hello foo");
		return "foo";
	}

	@Override
	public void addUser(String name, int age) {
		System.out.println("call hell addUser:" + name + ":" + age);
	}
}
