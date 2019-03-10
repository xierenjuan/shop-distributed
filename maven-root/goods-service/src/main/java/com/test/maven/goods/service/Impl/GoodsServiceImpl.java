package com.test.maven.goods.service.Impl;

import com.test.common.entity.Goods;
import com.test.common.entity.GoodsExample;
import com.test.maven.goods.dao.GoodsMapper;
import com.test.maven.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    @Transactional
    public void insert(Goods goods) {
        goodsMapper.insert(goods);
    }

    @Override
    public List<Goods> list() {
        return goodsMapper.selectByExample(new GoodsExample());
    }
}
