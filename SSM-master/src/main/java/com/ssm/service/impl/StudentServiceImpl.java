package com.ssm.service.impl;

import com.ssm.dao.StudentDao;
import com.ssm.entity.Student;
import com.ssm.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2016/6/27.
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    //注入StudentDao
    @Autowired
    private StudentDao studentDao;

    //插入一条学生记录
    public int insertStudent(Student student) {
        if (student != null) {
            int i = studentDao.insertStudent(student);
            if (i == 1) {
                return 1;
            }
        }
        return 0;
    }

    public int deleteStudentById(long sid) {
        int i = studentDao.deleteStudentById(sid);
        if (i == 1) {
            return 1;
        }
        return 0;
    }

    public int updateStudent(Student student) {
        if (student != null) {
            int i = studentDao.updateStudent(student);
            if (i == 1) {
                return 1;
            }
        }
        return 0;
    }

    public Student getStudentById(long sid) {
        Student stu = studentDao.getStudentById(sid);
        if (stu != null) {
            return stu;
        }
        return null;
    }

    public List<Student> queryAllStudent(@Param("offset") int offset, @Param("limit") int limit) {
        List<Student> sList = studentDao.queryAllStudent(offset, limit);
        if (sList != null) {
            return sList;
        }
        return null;
    }
}
