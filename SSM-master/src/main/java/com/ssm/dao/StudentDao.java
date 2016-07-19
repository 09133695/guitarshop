package com.ssm.dao;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StudentDao {

    //增加学生操作
    int insertStudent(Student student);

    //删除学生操作
    int deleteStudentById(long sid);

    //修改学生操作
    int updateStudent(Student student);

    //根据ID查询学生操作
    Student getStudentById(long sid);

    /**
     * 查询所有学生
     *
     * @param offset 偏移量
     * @param limit  查询个数
     * @return
     */
    List<Student> queryAllStudent(@Param("offset") int offset, @Param("limit") int limit);
}
