package com.neu.service;

import com.neu.bean.Student;

import java.util.List;

/**
 * Description: springmybatis-1
 * Created by Administrator on 2019/7/23 15:32
 */
public interface StudentService {
    boolean addStu(Student stu);

    boolean removeStu(int id);

    boolean modifyStu(Student stu);

    List<Student> findAllStu();

    Student findStuById(int id);

    List<Student> findStuByName(String name);
}
