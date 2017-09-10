package demo.spring.dependency;

import org.springframework.stereotype.Component;

@Component
public class Books {
private String bookID;
private String bookName;
private String subject;
private String bookType;
private String bookAuthor;
private String bookPrice;
private Category category;
public String getBookID() {
	return bookID;
}
public void setBookID(String bookID) {
	this.bookID = bookID;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getBookType() {
	return bookType;
}
public void setBookType(String bookType) {
	this.bookType = bookType;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getBookPrice() {
	return bookPrice;
}
public void setBookPrice(String bookPrice) {
	this.bookPrice = bookPrice;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
}
