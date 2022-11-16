package com.yf.container;

import com.yf.config.AppConfig;
import com.yf.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AnnoContainerTest
 * @Description TODO
 * @Author @yangfeng
 * @Date 2022/11/16 9:04
 * @Version 1.0
 */
public class AnnoContainerTest {

	@Test
	public void testStartContainer(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService testService = ac.getBean(TestService.class);
		testService.sayHello("张三");
	}
}
