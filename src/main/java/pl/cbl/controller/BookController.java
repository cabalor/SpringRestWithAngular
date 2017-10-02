package pl.cbl.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.cbl.dao.BookDao;
import pl.cbl.data.Book;
import pl.cbl.repo.BookRepo;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookDao bk;
	@Autowired
	private BookRepo repo;
	
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Book getbk(@PathVariable int id) {
		return bk.getbk(id);
		
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> books(){
		return repo.findAll();
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void book(@RequestBody Book book){
		bk.addbk(book);
		
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.DELETE)
	public void del(@PathVariable int id){
		bk.delBk(id);
		
	}
	
	
}
