package com.Springboot.Backend.Students.Management.System.SpringBoot.controller;

import com.Springboot.Backend.Students.Management.System.SpringBoot.model.Student;
import com.Springboot.Backend.Students.Management.System.SpringBoot.repository.StudentRepository;
import com.Springboot.Backend.Students.Management.System.SpringBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/allStudents")
    public List<Student> getAllStudents(){
        return  studentService.getAllStudents();
    }

}
