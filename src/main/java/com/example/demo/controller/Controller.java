package com.example.demo.controller;

import com.example.demo.Service.StudentService;
import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private StudentService studentService;

    @RequestMapping("hello3")
    public List<Student> hello3() {
        List<Student> list = studentService.findAll();
        return list;
    }



}