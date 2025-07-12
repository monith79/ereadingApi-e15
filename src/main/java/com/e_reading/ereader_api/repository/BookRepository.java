package com.e_reading.ereader_api.repository;

import com.e_reading.ereader_api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // By extending JpaRepository, we get methods like save(), findById(),
    // findAll(), and delete() for free!
}