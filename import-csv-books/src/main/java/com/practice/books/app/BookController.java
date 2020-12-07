package com.practice.books.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.practice.books.component.BookComponent;
import com.practice.books.dao.Book;

@RestController
public class BookController {
	
	@Autowired
	private BookComponent bookComponent;
	
	@PostMapping(value = "/upload", consumes = "multipart/form-data")
	@ResponseStatus(HttpStatus.CREATED)
	public void upload(@RequestParam("file") MultipartFile file) {
		bookComponent.addBooks(file);
	}
	
	@GetMapping(value="/getBookByIsbn")
	public Book getBookByIsbn(@RequestParam(name = "isbn") String isbn) {
		return bookComponent.getBookByIsbn(isbn);
	}
	
	@GetMapping(value="/getBookByTitle")
	public List<Book> getBookByTitle(@RequestParam(name = "title") String title) {
		return bookComponent.getBookByTitle(title);
	}
}
