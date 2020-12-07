package com.practice.books.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	Optional<Book> findByIsbn(String isbn);
	
	List<Book> findByTitleContaining(String infix);
}
