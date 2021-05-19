package com.exam.service;

import com.exam.entity.Admin;
import com.exam.entity.Student;
import com.exam.entity.Teacher;

public interface LoginService {

    public Admin adminLogin(Integer username, String password); //管理员登录

    public Teacher teacherLogin(Integer username, String password);//教师登录

    public Student studentLogin(Integer username, String password);//学生登录
}
