package com.Springboot.Backend.Students.Management.System.SpringBoot.service;

import com.Springboot.Backend.Students.Management.System.SpringBoot.exception.ResourceNotFoundException;
import com.Springboot.Backend.Students.Management.System.SpringBoot.model.Student;
import com.Springboot.Backend.Students.Management.System.SpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

   @Autowired
   private StudentRepository studentRepository;


   public List<Student> getAllStudents(){
      return studentRepository.findAll();
   }


   public Student createStudent(Student student) {
      return studentRepository.save(student);
   }

   //get Student By id

   public ResponseEntity<Student> getStudentById(Long id) {
      Student student= studentRepository.findById(id).orElseThrow(() ->
              new ResourceNotFoundException("Student not exist with id: " + id));
      return ResponseEntity.ok(student);
   }

   //update Student
   public ResponseEntity<Student> updateStudent(Long id ,Student studentDetails){
      Student student= studentRepository.findById(id).orElseThrow(() ->
              new ResourceNotFoundException("Student not exist with id: " + id));

      student.setFirstName(studentDetails.getFirstName());
      student.setLastName(studentDetails.getLastName());
      student.setEmailId(studentDetails.getEmailId());

      Student updatedStuent = studentRepository.save(student);
      return ResponseEntity.ok(updatedStuent);


   }


   public void deleteStudentById(Long id){
      studentRepository.deleteById(id);
   }

}
