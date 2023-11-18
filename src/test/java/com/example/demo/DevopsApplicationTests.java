package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Year;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsApplicationTests {
	
	private final DevopsApplication devopsApplication = new DevopsApplication();

	@Test
	void contextLoads() {
	}
	
	@Test
    public void testHello() {
        // Call the method under test
        String result = devopsApplication.hello("John");

        // Verify the result
        assertEquals("Hello John , this is " + Year.now().getValue(), result);
    }

}
