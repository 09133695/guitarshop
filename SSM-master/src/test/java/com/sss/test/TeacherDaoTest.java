package com.sss.test;

import com.ssm.dao.TeacherDao;
import com.ssm.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2016/6/27.
 */
public class TeacherDaoTest {

    ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring/spring-dao.xml"});

    @Test
    public void queryStudentWithTeacherTest() {
        TeacherDao teacherDao = (TeacherDao) ac.getBean("teacherDao");
        List<Student> sList = teacherDao.queryStudentWithTeacher(2);
        System.out.print(sList);
    }
    /****
     *[Student{sid=2, sname='刘备', gender='男', age=45, address='蜀国',
     * teacher=Teacher{tid=0, tname='诸葛亮', job='军师'}},
     * Student{sid=3, sname='关羽', gender='男', age=43, address='蜀国',
     * teacher=Teacher{tid=0, tname='诸葛亮', job='军师'}},
     * Student{sid=4, sname='张飞', gender='男', age=41, address='蜀国',
     * teacher=Teacher{tid=0, tname='诸葛亮', job='军师'}},
     * Student{sid=5, sname='赵云', gender='男', age=42, address='蜀国',
     * teacher=Teacher{tid=0, tname='诸葛亮', job='军师'}}]
     */
}
