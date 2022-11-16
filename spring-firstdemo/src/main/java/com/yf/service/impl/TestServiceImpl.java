package com.yf.service.impl;

import com.yf.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author @yangfeng
 * @Date 2022/11/16 9:00
 * @Version 1.0
 */
@Service
public class TestServiceImpl implements TestService {
	@Override
	public String sayHello(String name) {
		System.out.println("向:"+name+"问好");
		return name;
	}
}
