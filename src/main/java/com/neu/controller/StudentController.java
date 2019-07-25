package com.neu.controller;

import com.neu.bean.Student;
import com.neu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: ssm
 * Created by Administrator on 2019/7/24 17:15
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService stuService;


   @RequestMapping("/register.do")
    public String doRegister(Student stu, Model model) {
        if (stuService.addStu(stu)) {
            model.addAttribute("stu",stu);
            return "/index.jsp";
        } else {
            return "/addStu.jsp";
        }
    }
}
