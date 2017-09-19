package pl.cbl.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.cbl.dao.BookDao;
import pl.cbl.data.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookDao bk;
	
	
	
	@RequestMapping("/{id}")
	public Book getbk(@PathVariable int id) {
		return bk.getbk(id);
		
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> books(){
		return bk.getBooks();
	}
	
	@RequestMapping("/add/{title}/{author}")
	public Book add(@PathVariable String title, @PathVariable String author){
		return bk.addbk(title, author);
		
	}
	
	
}
