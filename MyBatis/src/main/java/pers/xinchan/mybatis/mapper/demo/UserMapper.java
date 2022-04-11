package pers.xinchan.mybatis.mapper.demo;

import pers.xinchan.mybatis.pojo.User;

import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-11
 */
public interface UserMapper {
    /**
     * 添加新用户
     */
    void insertUser();

    /**
     * 更新用户信息
     */
    void updateUser();

    /**
     * 根据指定 id 删除用户信息
     */
    void deleteUser();

    /**
     * 查询用户信息
     */
    User selectUser();

    /**
     * 查询所有用户信息
     */
    List<User> selectAllUser();
}
