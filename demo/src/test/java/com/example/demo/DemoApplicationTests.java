package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testGetContent() {
		Greeting greeting = new Greeting(1, "Test");
		assertEquals("Test", greeting.getContent());
	}
}
