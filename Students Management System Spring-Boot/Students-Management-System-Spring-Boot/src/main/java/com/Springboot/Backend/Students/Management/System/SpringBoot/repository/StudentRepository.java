package com.Springboot.Backend.Students.Management.System.SpringBoot.repository;

import com.Springboot.Backend.Students.Management.System.SpringBoot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student ,Long> {


}
