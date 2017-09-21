package pl.cbl.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pl.cbl.data.Book;

@Component
public class BookDao {

	List<Book> lista = new ArrayList<>();

	public List<Book> getBooks() {
		return lista;

	}

	public Book getbk(int id) {
		Book book = lista.get(id);
		return book;
	}
	
	public Book addbk(String title, String author) {
		Book book = new Book(title, author);
		lista.add(book);
		return book;
	}
	
	
	
	public BookDao() {
		lista.add(new Book("lalka", "bolek prus"));
		lista.add(new Book("new hope", "george lucas"));
		lista.add(new Book("pentagram", "jo nesbo"));

	}

	
}