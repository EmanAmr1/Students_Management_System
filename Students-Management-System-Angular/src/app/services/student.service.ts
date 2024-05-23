import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseURL="http://localhost:8080/api/v1/allStudents";
  private createStudentUrl="http://localhost:8080/api/v1/createStudent";
  private updateStudentUrl="http://localhost:8080/api/v1/updateStudent";
  private gettudentUrl="http://localhost:8080/api/v1/getStudent";
  constructor(private httpClient:HttpClient) {   }

  getStudentsList():Observable<Student[]>{
    return this.httpClient.get<Student[]>(`${this.baseURL}`);

  }

  createStudent(student:Student):Observable<Object>{
    return this.httpClient.post(`${this.createStudentUrl}`,student);
  }


  getStudentById(id:number):Observable<Student>{
    return this.httpClient.get<Student>(`${this.gettudentUrl}/${id}`);


  }

  }
