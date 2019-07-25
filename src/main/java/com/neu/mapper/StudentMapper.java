package com.neu.mapper;

import com.neu.bean.Student;

import java.util.List;
import java.util.Map;

/**
 * Description: mybatis01
 * Created by Administrator on 2019/7/20 16:02
 */
public interface StudentMapper {
    int insertStu(Student stu);

    int deleteStu(int id);

    int updateStu(Student stu);

    List<Student> selectAllStu();

    Student selectStuById(int id);

    List<Student> selectStuByName(String name);
}
