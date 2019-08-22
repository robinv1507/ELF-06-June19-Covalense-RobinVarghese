package com.covalense.lms.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Books")

public class BookBean implements Serializable {
	@Id
	@Column(name = "BookId")
	private int BookId;
	@Column(name = "BookName")
	private String bookName;
	@Column(name = "AuthorName")
	private String authorName;
	@Column(name = "Catagery")
	private String catagery ;
	     
	@Column(name = "ISBNNumber")
	private Long isbnNumber; 
	
	@Column(name = "Language")
	private String language;
	 
	@Column(name = "NumberOfCopies")
	private int numberOfCopies; 

	@Column(name = "AvailableCopies")
	private int availableCopies ;

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCatagery() {
		return catagery;
	}

	public void setCatagery(String catagery) {
		this.catagery = catagery;
	}

	public Long getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(Long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	        

}
