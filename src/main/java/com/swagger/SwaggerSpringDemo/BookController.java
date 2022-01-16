package com.swagger.SwaggerSpringDemo;

import com.swagger.SwaggerCodgen.api.BookApi;
import com.swagger.SwaggerCodgen.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController implements BookApi {

    @Override
    public ResponseEntity<String> addBook(Book book) {
        return ResponseEntity.ok(book.getTitle()+" is added");
    }

    @Override
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book().id(1L).title("Harry Potter").author("J.K"));
        bookList.add(new Book().id(2L).title("Moby Dick").author("Herman Melville"));
        return ResponseEntity.ok(bookList);
    }
}
