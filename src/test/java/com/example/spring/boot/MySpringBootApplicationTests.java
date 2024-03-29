package com.example.spring.boot;

import static org.assertj.core.api.Assertions.assertThat;

import org.example.spring.boot.MySpringBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringBootApplicationTests {
	
	@Autowired
	private MySpringBootApplication app;
	
	@Test
	public void contextLoads() {
		assertThat(app).isNotNull();
	}
}
