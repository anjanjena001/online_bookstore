package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategories",path = "book_Categories")
public interface CategoryRepository extends JpaRepository<BookCategory,Long> {

}
