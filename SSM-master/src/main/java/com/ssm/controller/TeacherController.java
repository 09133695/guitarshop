package com.ssm.controller;

import com.ssm.entity.Student;
import com.ssm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2016/6/27.
 */
@Controller
@RequestMapping("teacher")
public class TeacherController {

    //注入teacherService
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list() {
        return "stList";
    }

    @RequestMapping(value = "list", method = RequestMethod.POST)
    public String listStudentAndTeacher(long tid, Model model) {
        List<Student> sList = teacherService.queryStudentWithTeacher(tid);
        model.addAttribute("sList", sList);
        return "stList";
    }
}
