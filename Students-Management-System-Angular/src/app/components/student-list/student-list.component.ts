import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  studentsArr!:Student[]

  constructor(private studentService:StudentService , private router:Router) { }

  ngOnInit(): void {
    this.getStudents();
  }
private getStudents(){
  this.studentService.getStudentsList().subscribe(data => {
    this.studentsArr=data
  })
}


updatStudent(id:number){
this.router.navigate(["update-student",id])
}


deleteStudent(id:number){
  this.studentService.deleteStudentById(id).subscribe(data=>{ console.log(data) ;
    this.getStudents()});
}

goToStudentDetails(id:number){
  this.router.navigate(["student-details",id])
}

detailsStudent(id:number){
this.studentService.getStudentById(id).subscribe(data=>{

})

}
}
