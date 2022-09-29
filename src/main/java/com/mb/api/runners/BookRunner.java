package com.mb.api.runners;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.entity.Book;
import com.mb.api.persistance.repository.AuthorRepository;
import com.mb.api.persistance.repository.BookRepository;

@Component
public class BookRunner implements CommandLineRunner
{

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	public void run(String... args) throws Exception
	{
		
		
		Book book = new Book();
		book.setName("Let us C");
		book.setCost(550.10);
		book.setAuthors(
				Arrays.asList(
						authorRepository.findByAuthId(4),
						authorRepository.findByAuthId(5)
						)
				);
		
		bookRepository.save(book);
		

	}

}
