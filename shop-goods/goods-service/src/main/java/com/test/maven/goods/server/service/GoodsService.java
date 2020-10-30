package com.test.maven.goods.server.service;

import com.test.common.entity.Goods;

import java.util.List;

public interface GoodsService {

    void insert(Goods goods);

    List<Goods> list();
}
