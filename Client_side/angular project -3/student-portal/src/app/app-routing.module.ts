import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './Components/aboutus/aboutus.component';
import { ContactusComponent } from './Components/contactus/contactus.component';
import { HomeComponent } from './Components/home/home.component';
import { PipeDemoComponent } from './Components/pipe-demo/pipe-demo.component';
import { RedgisteredStudentsComponent } from './Components/redgistered-students/redgistered-students.component';
import { StudentRegComponent } from './Components/student-reg/student-reg.component';

const routes: Routes = [{path:"", component:HomeComponent}, {path:"register",  component:StudentRegComponent}, {path:"aboutus", component: AboutusComponent}, {path:"contactus", component: ContactusComponent}, {path:"pipe", component:PipeDemoComponent} ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
