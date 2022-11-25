import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const ROOT_URL:String="http://ec2-3-90-239-170.compute-1.amazonaws.com:8082/api/v1/digitalbooks/userservice"

@Injectable({
  providedIn: 'root'
})
export class AuthorloginService {

  saveauthor(author:{
    authorName:String;
	  authormailId:String;
	  authorPassword:String
}
  ) {
    return this.http.post(ROOT_URL+"/author/signup", author);
  }

  constructor(public http:HttpClient) { }
}
