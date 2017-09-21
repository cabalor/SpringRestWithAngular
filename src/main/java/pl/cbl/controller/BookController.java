package pl.cbl.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Book book(@RequestBody Book book){
		return bk.addbk(book.getTitle(), book.getAuthor());
		
	}
	
	
}
