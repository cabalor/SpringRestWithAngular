package pl.cbl.data;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {

	private static final AtomicInteger idNumber = new AtomicInteger(0);
	private int id;
	private String title;
	private String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book(String newTtile, String newAuthor) {
		id = idNumber.incrementAndGet();
		title = newTtile;
		this.author = newAuthor;
	}

}
