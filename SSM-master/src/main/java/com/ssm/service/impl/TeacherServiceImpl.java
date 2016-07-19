package com.ssm.service.impl;

import com.ssm.dao.TeacherDao;
import com.ssm.entity.Student;
import com.ssm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2016/6/27.
 */
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    //注入teacherService
    @Autowired
    private TeacherDao teacherDao;

    public List<Student> queryStudentWithTeacher(long tid) {
        List<Student> sList = teacherDao.queryStudentWithTeacher(tid);
        if (sList != null) {
            return sList;
        }
        return null;
    }
}
