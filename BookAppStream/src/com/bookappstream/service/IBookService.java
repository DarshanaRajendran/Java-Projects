package com.bookappstream.service;

import java.util.List;

import com.bookappstream.exceptions.BookNotFoundException;
import com.bookappstream.model.Book;

public interface IBookService {

	void addBook(Book book);
	List<Book> getAll();
	List<Book> getByAuthorContains(String author)throws BookNotFoundException;
	List<Book> getByCategory(String category)throws BookNotFoundException;
	List<Book> getByPriceLessThan(double price)throws BookNotFoundException;
	List<Book> getByAuthorContainsAndCategory(String author,String Category)throws BookNotFoundException;
    List<Book> getById(int bookId)throws BookNotFoundException;
}
