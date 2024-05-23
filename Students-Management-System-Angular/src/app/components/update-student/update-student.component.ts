import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { StudentService } from 'src/app/services/student.service';
import { Student } from 'src/app/student';

@Component({
  selector: 'app-update-student',
  templateUrl: './update-student.component.html',
  styleUrls: ['./update-student.component.css']
})
export class UpdateStudentComponent implements OnInit {

  id!:number;
  student: Student =new Student();

  constructor(private studentService:StudentService,private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.studentService.getStudentById(this.id).subscribe(data=>{this.student=data})
  }

  onSubmit(){

  }

}
