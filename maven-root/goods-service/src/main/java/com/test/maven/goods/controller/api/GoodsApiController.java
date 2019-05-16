package com.test.maven.goods.controller.api;

import com.test.common.dto.GoodsDto;
import com.test.common.entity.Goods;
import com.test.maven.api.GoodsApi;
import com.test.maven.goods.util.BeanUtils;
import com.test.maven.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@ApiIgnore
@RestController
public class GoodsApiController implements GoodsApi {

    @Autowired
    private GoodsService goodsService;


    @Override
    public List<GoodsDto> list(@RequestParam("i") int i) {
        List<Goods> goods = goodsService.list();
        List<GoodsDto> goodsDtos = BeanUtils.copyToOutList(goods, GoodsDto.class);
        return goodsDtos;
    }
}
