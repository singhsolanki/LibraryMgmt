package com.yash.model;

import java.sql.Date;

public class Book {

	private int bookID;
	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
	private String bookEdition;
	private int bookPrice;
	private int bookQauntity;
	private Date bookPurchaseDate;
	
	
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getBookEdition() {
		return bookEdition;
	}
	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookQauntity() {
		return bookQauntity;
	}
	public void setBookQauntity(int bookQauntity) {
		this.bookQauntity = bookQauntity;
	}
	
	public Date getBookPurchaseDate() {
		return bookPurchaseDate;
	}
	public void setBookPurchaseDate(Date bookPurchaseDate) {
		this.bookPurchaseDate = bookPurchaseDate;
	}
	
}
