package com.ssm.controller;

import com.ssm.entity.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2016/6/27.
 */
@Controller
@RequestMapping("student")
public class StudentController {

    //注入StudentService
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        //查询7条记录
        List<Student> studentList = studentService.queryAllStudent(0, 7);
        model.addAttribute("studentList", studentList);
        return "list";
    }

    //删除操作
    @RequestMapping(value = "delete/{sid}")
    public String delete(@PathVariable("sid") long sid){
        studentService.deleteStudentById(sid);
        //跳转的时候加上命名空间
        return "redirect:/student/list";
    }

    //跳转到修改页面
    @RequestMapping(value = "updateUI/{sid}")
    public String updateUI(@PathVariable("sid") long sid, HttpServletRequest request){
        request.setAttribute("sid",sid);
        return "updateUI";
    }

    //修改
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Student student){
        System.out.print(student);
        studentService.updateStudent(student);
        return "redirect:/student/list";
    }

    //添加页面
    @RequestMapping("addUI")
    public String addUI(){
        return "addUI";
    }

    //添加
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(Student student){
        studentService.insertStudent(student);
        return "redirect:/student/list";
    }
}
