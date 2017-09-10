package demo.spring.dependency;

import org.springframework.stereotype.Component;

@Component
public class Liberary {
private String lId;
private String libName;
private String libType;
private Books books;
private Category category;
public String getlId() {
	return lId;
}
public void setlId(String lId) {
	this.lId = lId;
}
public String getLibName() {
	return libName;
}
public void setLibName(String libName) {
	this.libName = libName;
}
public String getLibType() {
	return libType;
}
public void setLibType(String libType) {
	this.libType = libType;
}
public Books getBooks() {
	return books;
}
public void setBooks(Books book) {
	this.books = book;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}

}
