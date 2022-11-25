import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddBooksComponent } from './Components/add-books/add-books.component';
import { AllBooksComponent } from './Components/all-books/all-books.component';
import { ContactusComponent } from './Components/contactus/contactus.component';
import { HomeComponent } from './Components/home/home.component';

const routes: Routes = [{path:"", component:HomeComponent}, {path:"addBooks", component:AddBooksComponent}, {path:"getBooks", component:AllBooksComponent}, {path:"contactus", component:ContactusComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
