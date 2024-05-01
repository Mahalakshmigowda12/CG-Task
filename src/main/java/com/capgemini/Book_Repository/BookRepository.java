package com.capgemini.Book_Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.capgemini.Book_dto.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	
	

}
