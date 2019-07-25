package com.neu.service.impl;

import com.neu.bean.Student;
import com.neu.mapper.StudentMapper;
import com.neu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: springmybatis-1
 * Created by Administrator on 2019/7/23 15:33
 */
@Service("stuService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper stuMapper;

    @Override
    public boolean addStu(Student stu) {
        int count=stuMapper.insertStu(stu);
        if(count>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean removeStu(int id) {
        return false;
    }

    @Override
    public boolean modifyStu(Student stu) {
        return false;
    }

    @Override
    public List<Student> findAllStu() {
        return null;
    }

    @Override
    public Student findStuById(int id) {
        return null;
    }

    @Override
    public List<Student> findStuByName(String name) {
        return null;
    }
}
