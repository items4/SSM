package cn.gov.jseport.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.gov.jseport.entity.Goods;
import cn.gov.jseport.mapper.GoodsMapper;
import cn.gov.jseport.service.IGoodsService;
@Service
public class GoodsServiceImpl implements IGoodsService {
	@Resource
	private GoodsMapper goodsMapper;
	@Override
	public void save(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.insert(goods);
	}

	@Override
	@Transactional
	public void update(Goods goods) {
		// TODO Auto-generated method stub
		System.out.println(goods.getHostBusinessName()+goods.getGid()+"=======");
		goodsMapper.updateByPrimaryKey(goods);
	}

	@Override
	public void delete(Integer gid) {
		// TODO Auto-generated method stub
		goodsMapper.deleteByPrimaryKey(gid);
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return goodsMapper.selectByExample(null);
	}

	@Override
	public Goods findById(Integer gid) {
		// TODO Auto-generated method stub
		return goodsMapper.selectByPrimaryKey(gid);
	}

}
