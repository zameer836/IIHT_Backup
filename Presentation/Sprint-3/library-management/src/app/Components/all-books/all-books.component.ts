import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Entity/Book';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-all-books',
  templateUrl: './all-books.component.html',
  styleUrls: ['./all-books.component.css']
})
export class AllBooksComponent implements OnInit {

  deleteRow(book:any, index:number) {
    const observables = this.bookService.deleteBook(book);
    observables.subscribe((response:any) => {
      console.log(response);
      this.books.splice(index,1)
    })
  }


  books:Book[] = [];


  constructor(private bookService: BookService) { }

  ngOnInit(): void {
    const promise = this.bookService.getBooks();
    promise.subscribe((response) => {
      console.log(response);
      this.books = response as Book[];
    })
  }

}
