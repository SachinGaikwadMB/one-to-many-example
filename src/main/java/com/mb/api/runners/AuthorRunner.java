package com.mb.api.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.entity.Author;
import com.mb.api.persistance.repository.AuthorRepository;

//@Component
public class AuthorRunner implements CommandLineRunner
{

	@Autowired
	private AuthorRepository authorRepository;
	
	@Override
	public void run(String... args) throws Exception
	{

		Author author = new Author();
		author.setFirstName("Yashwant ");
		author.setLastName("Kamthame");
		author.setInfo("Popular Author");
		
		authorRepository.save(author);
		
		
	}

}
