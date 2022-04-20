package pers.xinchan.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import pers.xinchan.mybatis.pojo.User;

import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-18
 */
public interface ParameterMapper {
    /**
     * 查询所有用户信息
     */
    List<User> selectAllUser();

    /**
     * 根据用户 id 更新用户信息
     */
    void updateUserById(Integer id, String username);

    /**
     * 根据用户名查询用户信息（单个字面量）
     * @param xinchan
     */
    User selectUserByUsername(String xinchan);

    /**
     * 根据用户名和密码查询用户信息（多个字面量）
     */
    User selectUserByUP(String username, String password);

    /**
     * 添加新用户
     */
    void insertUser(User user);

    /**
     * 根据用户年龄查询用户信息（单个）
     */
    List<User> selectUserByAge(@Param("age") Integer age);

    /**
     * 根据用户名和用户年龄查询用户信息（多个）
     */
    List<User> selectUserByUA(@Param("username") String username, @Param("age") Integer age);
}
