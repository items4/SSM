package cn.gov.jseport.service;

import java.util.List;

import cn.gov.jseport.entity.Goods;

public interface IGoodsService {
	void save(Goods goods);
	void update(Goods goods);
	void delete(Integer gid);
	List findAll();
	Goods findById(Integer gid);
}
