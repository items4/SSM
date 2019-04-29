package cn.gov.jseport.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gov.jseport.entity.Goods;
import cn.gov.jseport.service.IBookService;
import cn.gov.jseport.service.IGoodsService;


@Controller
public class GoodsController {
	@Resource
	private IGoodsService goodsServiceImpl;
	@Resource
	private IBookService bookServiceImpl;
	
	@RequestMapping("/findAll")
	public String findAll(HttpSession session) {
		List list = goodsServiceImpl.findAll();
		session.setAttribute("list", list);
		return "/admin/goods/list";
	}
	
	@RequestMapping("/save")
	public String save(Goods goods) {
		goodsServiceImpl.save(goods);
		return "redirect:/admin/goods//findAll";
	}
	@RequestMapping("/update")
	public String update(Goods goods) {
		goodsServiceImpl.update(goods);
		return "redirect:/admin/goods//findAll";
	}
	
	@RequestMapping("/delete")
	public String update(Integer gid) {
		goodsServiceImpl.delete(gid);
		return "redirect:/admin/goods//findAll";
	}
	@RequestMapping("/findById")
	public String findById(Integer gid,ModelMap map) {
		Goods goods = goodsServiceImpl.findById(gid);
		map.put("goods", goods);
		return "forword:goInput";
	}
	@RequestMapping("/goInput")
	public String goInput(ModelMap map) {
		List books = bookServiceImpl.findAll();
		map.put("books", books);
		return "/admin/goods/input";
	}
}
