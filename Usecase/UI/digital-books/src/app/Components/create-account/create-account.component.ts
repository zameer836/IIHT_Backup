import { Component, OnInit } from '@angular/core';
import AuthorLogin from 'src/app/Entity/authorlogin';
import { AuthorloginService } from 'src/app/Services/authorlogin.service';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {

  authorlogin :AuthorLogin= new AuthorLogin();

  save() {
    console.log(this.authorlogin);

    const observable = this.authorService.saveauthor(this.authorlogin);
    observable.subscribe(
      (response:any) => {
        console.log(response);
      }
    )
    
  }

  constructor(private authorService: AuthorloginService) { }

  ngOnInit(): void {
  }

}
