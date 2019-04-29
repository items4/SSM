package cn.gov.jseport.service;

import java.util.List;

import cn.gov.jseport.entity.Book;


public interface IBookService {
	void save(Book book);
	void update(Book book);
	void delete(Integer bookid);
	List findAll();
	Book findById(Integer bookid);
	
}
