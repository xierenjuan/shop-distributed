package com.test.maven.order.dao;

import com.test.common.entity.Order;
import com.test.common.entity.OrderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(OrderExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(OrderExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Order record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Order record);

    /**
     *
     * @mbggenerated
     */
    List<Order> selectByExample(OrderExample example);

    /**
     *
     * @mbggenerated
     */
    Order selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Order record);
}