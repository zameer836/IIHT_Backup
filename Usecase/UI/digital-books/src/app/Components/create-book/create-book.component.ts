import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Entity/book';
import { BookServiceService } from 'src/app/Services/book-service.service';

@Component({
  selector: 'app-create-book',
  templateUrl: './create-book.component.html',
  styleUrls: ['./create-book.component.css']
})
export class CreateBookComponent implements OnInit {

  book:Book = new Book();

  save() {
    console.log(this.book);
    const observable = this.bookService.savebook(this.book);
    observable.subscribe(
      (response:any) => {
        console.log(response);
      }
    )
    
  }

  constructor(private bookService: BookServiceService) { }

  ngOnInit(): void {
  }

}
