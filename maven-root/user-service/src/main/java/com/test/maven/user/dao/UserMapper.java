package com.test.maven.user.dao;

import com.test.common.entity.User;
import com.test.common.entity.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    /**
     *
     * @mbggenerated
     */
    int countByExample(UserExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(User record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbggenerated
     */
    User selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(User record);
}