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

    public static void tets03(List<? extends Number> list){
        System.out.println("泛型方法6");

    }
    @Override
    @Transactional
    public void insert(Goods goods) {
        goodsMapper.insert(goods);
    }

    @Override
    public List<Goods> list() {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        GoodsExample.Criteria criteria1 = criteria.andIdEqualTo(1L);
        return goodsMapper.selectByExample(goodsExample);
    }
}
