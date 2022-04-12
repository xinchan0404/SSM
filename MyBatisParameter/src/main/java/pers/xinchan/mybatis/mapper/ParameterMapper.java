package pers.xinchan.mybatis.mapper;

import pers.xinchan.mybatis.pojo.User;

import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-12
 */
public interface ParameterMapper {
    /**
     * 查询所有用户信息
     */
    List<User> getAllUser();
}
