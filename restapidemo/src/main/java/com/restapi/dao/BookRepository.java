package com.restapi.dao;

import com.restapi.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findById(int id);
}
