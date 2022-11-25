import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import Book from 'src/app/Entity/book';
import { BookServiceService } from 'src/app/Services/book-service.service';

@Component({
  selector: 'app-search-book',
  templateUrl: './search-book.component.html',
  styleUrls: ['./search-book.component.css']
})
export class SearchBookComponent implements OnInit {

  books:Book[]=[];
  book:Book = new Book();

  searchbooks() {

    console.log(this.book);
    const observable = this.bookservice.searchbook(this.book.title,this.book.category,this.book.price,this.book.publisher,this.book.image)
    observable.subscribe(
      (response)=> {
        this.books=response as Book[];
      }
    )
    console.log(this.book);
  }

// private book = new Book();
// private data;
  

constructor(private bookservice:BookServiceService) { }

ngOnInit(): void {
  
}

// form=new FormGroup({
//   title:new FormControl(),
//   author:new FormControl(),
//   category:new FormControl(),
//   price:new FormControl()
// })

//   getData(book: Book)

//   {
//     this.bookservice.getData(book).subscribe(
//       (response) => {
//         this.data = response;
//       },
//       error=> {
//         console.log("error");
        
//       }
        
//     );
    
//   }

//   searchForm(searchInfo: any) {
//     this.book.title = this.Title.value;
//     this.book.author = this.Author.value;
//     this.getData(this.book);
//   }

//   getTitle() 
//   {
//     return this.form.get('title');
//   }

//   getAuthor() 
//   {
//     return this.form.get('author');
//   }
}
