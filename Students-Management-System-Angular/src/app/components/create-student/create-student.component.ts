import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student';

@Component({
  selector: 'app-create-student',
  templateUrl: './create-student.component.html',
  styleUrls: ['./create-student.component.css']
})
export class CreateStudentComponent implements OnInit {

  student: Student = new Student();
  constructor(private studentService: StudentService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.student);
  }

  saveStudent() {
    this.studentService.createStudent(this.student).subscribe(data => {
      console.log(data);
      this.goToStudentList();
    }, error => console.log(error));
  }

  goToStudentList() {
    this.router.navigate(['/students'])
  }

  public onSubmit() {
    this.saveStudent();
  }
}
