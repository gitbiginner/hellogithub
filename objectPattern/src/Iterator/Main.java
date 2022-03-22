package Iterator;

import java.util.Iterator;
public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("ADDED"));
		bookShelf.appendBook(new Book("angel"));
		bookShelf.appendBook(new Book("bible"));
		bookShelf.appendBook(new Book("cat"));
		bookShelf.appendBook(new Book("dog"));
		
		Iterator<Book> it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		System.out.println();
		for (Book book: bookShelf) {
			System.out.println(book.getName());
		}
		System.out.println();
	}
}
