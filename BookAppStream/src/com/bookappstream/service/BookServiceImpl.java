package com.bookappstream.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bookappstream.exceptions.BookNotFoundException;
import com.bookappstream.model.Book;
import com.bookappstream.util.BookDetails;
import com.bookappstream.service.IBookService;

public class BookServiceImpl implements IBookService{
	

	@Override
	public List<Book> getAll() {
		
		List<Book> books=BookDetails.showBooks();
		return books;
	}

	
	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {

		List<Book> books=getAll();
		List<Book> getbyauthorcontains=books.stream()
				.filter(book1->book1.getAuthor().equals(author))
				.collect(Collectors.toList());
		return getbyauthorcontains;
	}
	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {

		List<Book> books=getAll();
		List<Book> getbycategory=books.stream()
				.filter(book1->book1.getCategory().equals(category))
				.collect(Collectors.toList());
		return (List<Book>) getbycategory;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {

		List<Book> books=getAll();
		List<Book> getbypricelessthan=books.stream()
				.filter(book1->book1.getPrice()>=price)
				.collect(Collectors.toList());
		return getbypricelessthan;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {

		List<Book> books=getAll();
		List<Book> getbyauthorcontainsandcategory=books.stream()
				.filter(book1->book1.getAuthor().equals(author))
			    .filter(book1->book1.getCategory().equals(category))
				.collect(Collectors.toList());
		return getbyauthorcontainsandcategory;
	}
	

	@Override
	public List<Book> getById(int bookId) throws BookNotFoundException {
		List<Book> books=getAll();
		List<Book> getbyId=books.stream()
				.filter(book->book.getBookId().equals(bookId))
				.collect(Collectors.toList());
		return getbyId;
	}


	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}
}
