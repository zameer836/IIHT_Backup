import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './Components/home/home.component';
import { StudentRegComponent } from './Components/student-reg/student-reg.component';
import { NavbarComponent } from './Components/navbar/navbar.component';
import { FormsModule } from '@angular/forms';
import { AboutComponent } from './Components/about/about.component';
import { RedgisteredStudentsComponent } from './Components/redgistered-students/redgistered-students.component';
import { PipeDemoComponent } from './Components/pipe-demo/pipe-demo.component';
import { EllipsisPipe } from './Pipes/ellipsis.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    StudentRegComponent,
    NavbarComponent,
    AboutComponent,
    RedgisteredStudentsComponent,
    PipeDemoComponent,
    EllipsisPipe,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
