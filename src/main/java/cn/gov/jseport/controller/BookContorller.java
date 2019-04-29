package cn.gov.jseport.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gov.jseport.entity.Book;
import cn.gov.jseport.service.IBookService;

@Controller
public class BookContorller {
	@Resource
	private IBookService bookServiceImpl;
	
	@RequestMapping("/books_findAll")
	public String findAll(HttpSession session) {
		List list = bookServiceImpl.findAll();
		session.setAttribute("list", list);
		return "/admin/books/list";
	}
	
	@RequestMapping("/books_save")
	public String save(Book book) {
		bookServiceImpl.save(book);
		return "redirect:/books_findAll";
	}
	@RequestMapping("/books_update")
	public String update(Book book) {
		bookServiceImpl.update(book);
		return "redirect:/books_findAll";
	}
	
	@RequestMapping("books_delete")
	public String update(Integer bookid) {
		bookServiceImpl.delete(bookid);
		return "redirect:/books_findAll";
	}
	@RequestMapping("/books_findById")
	public String findById(Integer bookid,ModelMap map) {
		Book books = bookServiceImpl.findById(bookid);
		map.put("books", books);
		return "forward:books_goInput";
	}
	@RequestMapping("/books_goInput")
	public String goInput(ModelMap map) {
		
		return "/admin/books/input";
	}
}
