package com.sss.test;

import com.ssm.dao.StudentDao;
import com.ssm.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2016/6/27.
 */
public class StudentDaoTest {

    ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring/spring-dao.xml"});

    //测试增加学生操作
    @Test
    public void insertStudentTest() {
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        Student student = new Student();
        student.setAddress("北京");
        student.setAge(23);
        student.setGender("男");
        student.setSname("路人甲");
        int i = studentDao.insertStudent(student);
        System.out.print(i);
    }

    //删除学生操作
    @Test
    public void deleteStudentByIdTest() {
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        int i = studentDao.deleteStudentById(14);
        System.out.print(i);
    }

    //更新学生操作
    @Test
    public void updateStudentTest() {
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        Student student = new Student();
        student.setGender("女");
        student.setSname("女二号");
        student.setAge(21);
        student.setAddress("西安");
        student.setSid(15);//数据中已存在的ID
        int i = studentDao.updateStudent(student);
        System.out.print(i);
    }

    //通过ID查询
    @Test
    public void getStudentByIdTest() {
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        Student student = studentDao.getStudentById(12);
        System.out.print(student);
        //Student{sid=0, sname='黄盖', gender='男', age=65, address='吴国', teacher=null}
    }

    //limit查询
    @Test
    public void queryAllStudentTest() {
        StudentDao studentDao = (StudentDao) ac.getBean("studentDao");
        List<Student> sList = studentDao.queryAllStudent(0, 5);
        System.out.print(sList);
        /***
         * [Student{sid=0, sname='女二号', gender='女', age=21, address='西安', teacher=null},
         * Student{sid=0, sname='小乔', gender='女', age=18, address='吴国', teacher=null},
         * Student{sid=0, sname='黄盖', gender='男', age=65, address='吴国', teacher=null},
         * Student{sid=0, sname='鲁肃', gender='男', age=35, address='吴国', teacher=null},
         * Student{sid=0, sname='孙权', gender='男', age=18, address='吴国', teacher=null}]
         */
    }
}
