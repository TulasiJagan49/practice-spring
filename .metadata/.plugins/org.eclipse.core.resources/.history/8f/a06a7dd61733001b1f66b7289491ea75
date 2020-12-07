package com.practice.books.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.practice.books.component.BookComponent;

@RestController
public class BookController {
	
	@Autowired
	private BookComponent bookComponent;
	
	@PostMapping(value = "/upload", consumes = "multipart/form-data")
	@ResponseStatus(HttpStatus.CREATED)
	public void upload(@RequestParam("file") MultipartFile file) {
		bookComponent.addBooks(file);
	}

}
