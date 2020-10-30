package com.test.maven.goods.server.dao;

import com.test.common.entity.MethodLock;
import com.test.common.entity.MethodLockExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MethodLockMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(MethodLockExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(MethodLockExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(MethodLock record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MethodLock record);

    /**
     *
     * @mbggenerated
     */
    List<MethodLock> selectByExample(MethodLockExample example);

    /**
     *
     * @mbggenerated
     */
    MethodLock selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MethodLock record, @Param("example") MethodLockExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MethodLock record, @Param("example") MethodLockExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MethodLock record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MethodLock record);
}