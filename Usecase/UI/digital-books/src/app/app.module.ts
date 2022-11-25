import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './Components/home/home.component';
import { SearchBookComponent } from './Components/search-book/search-book.component';
import { CreateBookComponent } from './Components/create-book/create-book.component';
import { CreateAccountComponent } from './Components/create-account/create-account.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { AuthorLoginComponent } from './Components/author-login/author-login.component';
import { GetBooksComponent } from './Components/get-books/get-books.component';
import { LgnsuccessComponent } from './Components/lgnsuccess/lgnsuccess.component';
import { SignupSuccessComponent } from './Components/signup-success/signup-success.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    SearchBookComponent,
    CreateBookComponent,
    CreateAccountComponent,
    AuthorLoginComponent,
    GetBooksComponent,
    LgnsuccessComponent,
    SignupSuccessComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
