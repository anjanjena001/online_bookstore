import { Book } from './../common/book';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseurl="http://localhost:8080/api/v1/books"

  constructor(private httpClient:HttpClient) { }

  getbooks():Observable<Book[]> {
    return this.httpClient.get<GetResponseBooks>(this.baseurl).pipe(
      map(responce=>responce._embedded.books)
    );
  }

}

interface GetResponseBooks{
  _embedded:{
    books: Book[];
  }
}