package com.capgemini.Book_service;

import java.util.List;

import com.capgemini.Book_dao.BookDao;
import com.capgemini.Book_dto.Book;

public class BookService {
    private BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book createBook(Book book) {
       
        return bookDao.create(book);
    }

    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }

    public Book getBookById(Long id) {
        return bookDao.findById(id);
    }

    public Book updateBook(Book book) {
     
        return bookDao.update(book);
    }

    public boolean deleteBook(Long id) {
        return bookDao.delete(id);
    }
}

