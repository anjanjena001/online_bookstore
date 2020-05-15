import { BookService } from './../../services/book.service';

import { Component, OnInit } from '@angular/core';
import { Book } from './../../common/book';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
  books: Book[];

  constructor(private bookservice:BookService) { }

  ngOnInit() {
    this.listBook();
  }
  listBook(){
    this.bookservice.getbooks().subscribe(
     data=>this.books=data

    )
    
  }

}
