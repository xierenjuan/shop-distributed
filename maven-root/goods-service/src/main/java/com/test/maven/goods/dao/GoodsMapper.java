package com.test.maven.goods.dao;

import com.test.common.entity.Goods;
import com.test.common.entity.GoodsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GoodsMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(GoodsExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(GoodsExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Goods record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Goods record);

    /**
     *
     * @mbggenerated
     */
    List<Goods> selectByExample(GoodsExample example);

    /**
     *
     * @mbggenerated
     */
    Goods selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Goods record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Goods record);
}