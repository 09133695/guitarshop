package test;

import java.io.File;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Teacher;
import service.TeacherService;
import util.ImportExcel;

public class TeacherServiceTest {

	TeacherService ts = null;
	
	@Before
	public void setUp() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ts = (TeacherService) context.getBean("teacherService");
	}

	@Test
	public void test() {
		File file = new File("src/com/course/selection/test/Book1.xls");
		System.out.println(file.getAbsolutePath().toString());
		System.out.println(file.exists());

		List<Teacher> teachers = null;
		try {
			teachers = ImportExcel.importTeacherByExcel(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		ts.createTeachers(teachers);
	}
}
