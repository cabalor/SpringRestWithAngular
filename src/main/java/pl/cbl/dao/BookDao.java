package pl.cbl.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import pl.cbl.data.Book;
import pl.cbl.repo.BookRepo;

@Repository
@Transactional
public class BookDao {

	//List<Book> lista = new ArrayList<>();

	@PersistenceContext
	private EntityManager em;
	

	public Book getbk(long id) {
		
		return em.find(Book.class, id);
	}
	
	public void addbk(Book bk) {
		em.merge(bk);
	}
	
	public void delBk(long id) {
		Book book = em.find(Book.class, id);
		em.remove(book);
	}
	
	
	
	/*public BookDao() {
		lista.add(new Book("lalka", "bolek prus"));
		lista.add(new Book("new hope", "george lucas"));
		lista.add(new Book("pentagram", "jo nesbo"));

	}*/

	
}
