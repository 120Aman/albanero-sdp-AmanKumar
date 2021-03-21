package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class SpringBootPostApplicationTests {

	@InjectMocks
	private postcontroller homeController = new postcontroller();
	@MockBean
	private User user;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	User user1 = new User("1","a","Aman","ak@gmail.com","9087654345","albanero");
	@Test
	public void testGetUsersByusername() {
		try {
			ResponseEntity<User> result = homeController.getUsersByusername ("a");
			assertEquals(user1,result.getBody());
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
	@Test
	public void testGetUsersById() {
		try {
			ResponseEntity<User> result = homeController.getUsersByusername ("1");
			assertEquals(user1,result.getBody());
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}	
}
