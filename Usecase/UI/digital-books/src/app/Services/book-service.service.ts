import { getLocaleDateFormat } from '@angular/common';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Book from '../Entity/book';



const BASE_URL="http:/localhost/:8081/api/v1/digitalbooks/saveBook"
const BASE_URL2="http://localhost:8081/api/v1/digitalbooks/getAllBooks"

 

// ec2-52-203-31-121.compute-1.amazonaws.com

@Injectable({
  providedIn: 'root'
})
export class BookServiceService {
 
  book:Book = new Book();

  savebook(book:{
    image: String;
    title:String;
  category:String;
  price:number;
  publisher:String;
}
  ) {
    return this.http.post(BASE_URL, book);
  }

  getBooks() {
    return this.http.get(BASE_URL2); 
  }



  searchbook(title:string,category:string,price:number,author:string,publisher:string) {
    let queryparams = new HttpParams();
    queryparams.append("title", title)
    .append("category", category)
    .append("author", author)
    .append("publisher", publisher)
    .append("price", price.toString());
    console.log(queryparams.getAll("book"));

    return  this.http.get("http://localhost:8081/api/v1/digitalbooks/search?query="+title);
    
  }

 
  // deleteBook(book:any) {
  //   return this.http.delete(BASE_URL3+"/"+book.id)
  // }

  constructor(public http:HttpClient) { }

//  private base_url3="http://localhost:8081/api/v1/digitalbooks/";

//   getData(book:Book) {
//     let url=this.base_url3+"search";
//     return this.http.post(url, book);
//   }
}
