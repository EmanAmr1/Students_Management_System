package com.Springboot.Backend.Students.Management.System.SpringBoot.controller;

import com.Springboot.Backend.Students.Management.System.SpringBoot.model.Student;
import com.Springboot.Backend.Students.Management.System.SpringBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    private StudentService studentService;

   //get all students
    @GetMapping("/allStudents")
    public List<Student> getAllStudents(){
        return  studentService.getAllStudents();
    }

    //create student rest api
    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody  Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/getStudent/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id ,@RequestBody Student studentDetails){
        return studentService.updateStudent(id,studentDetails);
    }

}
