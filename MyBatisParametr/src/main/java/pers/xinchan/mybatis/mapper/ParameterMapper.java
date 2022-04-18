package pers.xinchan.mybatis.mapper;

import pers.xinchan.mybatis.pojo.User;

import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-18
 */
public interface ParameterMapper {
    /**
     * 添加新用户
     */
    void insertUser();

    /**
     * 查询所有用户信息
     */
    List<User> selectAllUser();
}
