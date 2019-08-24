package com.covalense.lms.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.BookBean;
import com.covalense.lms.dto.ResponseData;
import com.covalense.lms.dto.BookBean;
import com.covalense.lms.dto.BookBean;
import com.covalense.lms.repository.BookRepository;
import com.covalense.lms.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class BookController {
	@Autowired
	BookRepository bookRepository;

	@PostMapping(path = "/addBook", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData addBook(@RequestBody BookBean bookBean) {

		ResponseData bookResponse = new ResponseData();
		if (!bookRepository.existsById(bookBean.getBookId())) {
			// creating new books into Db
			bookRepository.save(bookBean);
			bookResponse.setStatusCode(201);
			bookResponse.setMsg("Successfull");
			bookResponse.setDescription("New Book successfully Added");

		} else {
			bookResponse.setStatusCode(401);
			bookResponse.setMsg("failed");
			bookResponse.setDescription("Book is allready exist ");
		}

		return bookResponse;
	}// end of addBook()

	@PostMapping(path = "/updateBook", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData updateBook(@RequestBody BookBean bookBean) {

		ResponseData bookResponse = new ResponseData();
		if (bookRepository.existsById(bookBean.getBookId())) {

			bookRepository.save(bookBean);
			bookResponse.setStatusCode(201);
			bookResponse.setMsg("Successfull");
			bookResponse.setDescription("Book Data updated successfully ");

		} else {
			bookResponse.setStatusCode(401);
			bookResponse.setMsg("failed");
			bookResponse.setDescription("Book Data is not  exist ");
		}
		return bookResponse;
	}// end of updateBook()

	@GetMapping(path = "/deleteBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData deleteBook(int bookId) {

		ResponseData bookResponse = new ResponseData();
		if (bookRepository.existsById(bookId)) {
			BookBean bean = bookRepository.findById(bookId).get();
			bookRepository.delete(bean);
			bookResponse.setStatusCode(201);
			bookResponse.setMsg("Successfull");
			bookResponse.setDescription("Book Data deleted successfully ");
		} else {
			bookResponse.setStatusCode(401);
			bookResponse.setMsg("failed");
			bookResponse.setDescription("Book Data not present ");
		}
		return bookResponse;
	}// end of deleteBook()

	@GetMapping(path = "/getBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData getBookByName(String bookName) {

		ResponseData bookResponse = new ResponseData();

		if (bookRepository.existsByBookName(bookName)) {

			BookBean bean = bookRepository.findByBookName(bookName);
			bookResponse.setStatusCode(201);
			bookResponse.setMsg("Succesfull");
			bookResponse.setDescription("Book found");
			bookResponse.setBookBean(Arrays.asList(bean));

		} else {
			bookResponse.setStatusCode(401);
			bookResponse.setMsg("Failure");
			bookResponse.setDescription("Book not found");
		}
		return bookResponse;

	}// end of getBookByName()

	@GetMapping(path = "/getAllBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData getAllBook() {

		ResponseData userResponse = new ResponseData();
		userResponse.setStatusCode(201);
		userResponse.setMsg("Succesfull");
		userResponse.setDescription("Book found");
		userResponse.setBookBean(bookRepository.findAll());

		return userResponse;

	}// end of getAllBook()

}
