package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book>{
	//private Book[] books;
	private List<Book> books;
	
	public BookShelf(int initialsize) {
		this.books = new ArrayList<>(initialsize);
	}
	//private int last = 0;
	/*
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	*/
	
	
	public Book getBookAt(int index) {
		//return books[index];
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		//this.books[last] = book;
		books.add(book);
		//last++;
	}
	
	public int getLength() {
		//return last;
		return books.size();
	}
	
	@Override
	public Iterator<Book> iterator(){
		return new BookShelfIterator(this);
	}
}
