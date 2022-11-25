import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthorLoginComponent } from './Components/author-login/author-login.component';
import { CreateAccountComponent } from './Components/create-account/create-account.component';
import { CreateBookComponent } from './Components/create-book/create-book.component';
import { GetBooksComponent } from './Components/get-books/get-books.component';
import { HomeComponent } from './Components/home/home.component';
import { LgnsuccessComponent } from './Components/lgnsuccess/lgnsuccess.component';
import { SearchBookComponent } from './Components/search-book/search-book.component';
import { SignupSuccessComponent } from './Components/signup-success/signup-success.component';

const routes: Routes = [{path:"", component:AuthorLoginComponent} ,{path:"createaccount", component:CreateAccountComponent} , {path:"createbooks", component:CreateBookComponent}, {path:"getbooks", component:GetBooksComponent}, {path:"success", component:LgnsuccessComponent}, {path:"signup-succes", component:SignupSuccessComponent},{path:"searchbook", component:SearchBookComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
