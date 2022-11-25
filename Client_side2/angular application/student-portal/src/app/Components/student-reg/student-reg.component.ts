import { Component, OnInit } from '@angular/core';
import Student from 'src/app/Entity/Student';

@Component({
  selector: 'app-student-reg',
  templateUrl: './student-reg.component.html',
  styleUrls: ['./student-reg.component.css']
})
export class StudentRegComponent implements OnInit {
title = "Fill out the details below" //one way binding
   
student:Student = new Student;

  save() {
    console.log();
    
  }

  constructor() { }

  ngOnInit(): void {
  }

}
