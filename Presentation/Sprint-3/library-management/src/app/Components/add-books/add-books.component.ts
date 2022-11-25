import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Entity/Book';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-add-books',
  templateUrl: './add-books.component.html',
  styleUrls: ['./add-books.component.css']
})
export class AddBooksComponent implements OnInit {

  book:Book = new Book;
  

 

  
  save() {
    const observable = this.bookService.saveBook(this.book);
    observable.subscribe(
      (response:any) => {
        console.log(response);
      } , function(error) {
        console.log(error);
        alert("Something went wrong please try again")
      }
    )
  }

  constructor(private bookService:BookService) { }

  ngOnInit(): void {
  }

}
