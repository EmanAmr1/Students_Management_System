import { Component, OnInit } from '@angular/core';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  studentsArr!:Student[]

  constructor(private studentService:StudentService) { }

  ngOnInit(): void {
    this.getStudents();
  }
private getStudents(){
  this.studentService.getStudentsList().subscribe(data => {
    this.studentsArr=data
  })
}

}
