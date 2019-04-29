package cn.gov.jseport.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import cn.gov.jseport.entity.Book;
import cn.gov.jseport.entity.Goods;
import cn.gov.jseport.mapper.BookMapper;
import cn.gov.jseport.service.IBookService;
@Controller
public class BookServiceImpl implements IBookService {
	@Resource
	private BookMapper bookMapper;
	
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return bookMapper.selectByExample(null);
	}

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		bookMapper.insert(book);
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		bookMapper.updateByPrimaryKey(book);
	}

	@Override
	public void delete(Integer bookid) {
		// TODO Auto-generated method stub
		bookMapper.deleteByPrimaryKey(bookid);
	}

	@Override
	public Book findById(Integer bookid) {
		// TODO Auto-generated method stub
		return bookMapper.selectByPrimaryKey(bookid);
	}

}
