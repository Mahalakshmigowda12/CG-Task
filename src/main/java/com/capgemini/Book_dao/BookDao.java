package com.capgemini.Book_dao;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.Book_dto.Book;

public class BookDao {
    private static List<Book> books = new ArrayList<>();
    private static Long nextId = 1L;

    
    public Book create(Book book) {
        book.setId(nextId++);
        books.add(book);
        return book;
    }

    
    public List<Book> findAll() {
        return books;
    }

    
    public Book findById(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null; 
    }

   
    public Book update(Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(updatedBook.getId())) {
                books.set(i, updatedBook);
                return updatedBook;
            }
        }
        return null; 
    }

    
    public boolean delete(Long id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                return true;
            }
        }
        return false; 
    }
}




