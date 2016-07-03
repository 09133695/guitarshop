package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import exception.RoleNotExistException;
import exception.UserExistException;
import model.Role;
import model.User;
import service.UserService;

public class UserDaoTest {
	
	UserService us = null;
	
	@Before
	public void setUp() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		us = (UserService) context.getBean("userService");
	}

	@Test
	public void test() {
		User user = new User();
		user.setAccount("admin");
		user.setPassword("123");
		Role role = new Role();
		role.setRoleNmae("Admin");
		user.setRole(role);
		try {
			us.createUser(user);
		} catch (RoleNotExistException e) {
			e.printStackTrace();
		} catch (UserExistException e) {
			e.printStackTrace();
		}
	}

}
