package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.api.persistance.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>
{

}
