package pl.cbl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.cbl.data.Book;


public interface BookRepo extends JpaRepository<Book, Long> {

}
