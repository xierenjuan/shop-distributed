package com.test.maven.goods.server.dao;

import com.test.common.entity.Shop;
import com.test.common.entity.ShopExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ShopMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(ShopExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(ShopExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Shop record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Shop record);

    /**
     *
     * @mbggenerated
     */
    List<Shop> selectByExample(ShopExample example);

    /**
     *
     * @mbggenerated
     */
    Shop selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Shop record);
}