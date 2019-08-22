package com.covalense.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.covalense.lms.dto.BookBean;

public interface BookRepository  extends JpaRepository<BookBean,Integer> {
	
	public BookBean findByBookName(String name);
	
	public Boolean existsByBookName(String name);

}
