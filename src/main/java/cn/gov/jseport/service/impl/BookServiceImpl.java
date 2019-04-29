package cn.gov.jseport.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

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

}
