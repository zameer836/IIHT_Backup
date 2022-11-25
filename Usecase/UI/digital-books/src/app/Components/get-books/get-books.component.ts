import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Entity/book';
import { BookServiceService } from 'src/app/Services/book-service.service';

@Component({
  selector: 'app-get-books',
  templateUrl: './get-books.component.html',
  styleUrls: ['./get-books.component.css']
})
export class GetBooksComponent implements OnInit {

  // deleteRow(book:any, index:number) {
  //   const observables = this.getbookservice.deleteBook(book);
  //   observables.subscribe((response:any) => {
  //     console.log(response);
  //     this.books.splice(index,1)
  //   })
  // }


  books:Book[] = [];

  constructor(private getbookservice: BookServiceService) { }

  ngOnInit(): void {
    const promise = this.getbookservice.getBooks();
    promise.subscribe((response) => {
      console.log(response);
      this.books = response as Book[];
    })
  }

}
