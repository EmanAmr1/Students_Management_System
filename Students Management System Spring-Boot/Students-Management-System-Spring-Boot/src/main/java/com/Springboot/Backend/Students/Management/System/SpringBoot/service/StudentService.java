package com.Springboot.Backend.Students.Management.System.SpringBoot.service;

import com.Springboot.Backend.Students.Management.System.SpringBoot.model.Student;
import com.Springboot.Backend.Students.Management.System.SpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

   @Autowired
   private StudentRepository studentRepository;


   public List<Student> getAllStudents(){
      return studentRepository.findAll();
   }
}
