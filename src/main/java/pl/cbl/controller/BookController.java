package pl.cbl.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.cbl.dao.BookDao;
import pl.cbl.data.Book;

@RestController
public class BookController {

	@Autowired
	private BookDao bk;
	
	
	
	@RequestMapping("/book/{id}")
	public Book getbk(@PathVariable int id) {
		return bk.getbk(id);
		
	}
	
	@RequestMapping("/books")
	public List<Book> books(){
		return bk.getBooks();
	}
}
