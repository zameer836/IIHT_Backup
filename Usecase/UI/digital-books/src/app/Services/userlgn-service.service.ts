import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const BASE_URL ="http://digitalbooksdb2.cqm4wq74nhkr.us-east-1.rds.amazonaws.com:8081/api/v1/digitalbooks"; // instead of this you will have your sspringboot endpoints 

@Injectable({
  providedIn: 'root'
})
export class UserlgnServiceService {
  loginService(user: {
    firstname:String;
    lastname:String;  
    email:String;
    password:String;
    title:String
  }) {
    return this.http.post(BASE_URL+"/"+"sign-in", user);
  }

  constructor(public http: HttpClient) { }
}
