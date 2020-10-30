package com.test.maven.goods.server.dao;

import com.test.common.entity.Enterprise;
import com.test.common.entity.EnterpriseExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EnterpriseMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(EnterpriseExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(EnterpriseExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated
     */
    int insert(Enterprise record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Enterprise record);

    /**
     *
     * @mbggenerated
     */
    List<Enterprise> selectByExample(EnterpriseExample example);

    /**
     *
     * @mbggenerated
     */
    Enterprise selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Enterprise record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Enterprise record);
}