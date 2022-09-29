package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mb.api.persistance.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>
{
	Author findByAuthId(Integer id);
}
