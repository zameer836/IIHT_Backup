import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import AuthorSignIn from 'src/app/Entity/authorsignin';
import { AuthorSigninService } from 'src/app/Services/author-signin.service';

@Component({
  selector: 'app-author-login',
  templateUrl: './author-login.component.html',
  styleUrls: ['./author-login.component.css']
})
export class AuthorLoginComponent implements OnInit {

  authorsignin:AuthorSignIn = new AuthorSignIn;

  save() {
    console.log(this.authorsignin);
    
    const observable = this.authorsignservice.verifyauthor(this.authorsignin);
    observable.subscribe(
      (response:any)=> {
        console.log(response);
        
      }
    )
    
  }

  

  
  constructor(private authorsignservice: AuthorSigninService) { }

  ngOnInit(): void {
  }

}
