package pers.xinchan.mybatis.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import pers.xinchan.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-20
 */
public interface SelectMapper {
    /**
     * 根据用户 id 查询用户信息（单个实体类对象）
     */
    User selectUserById(@Param("id") Integer id);

    /**
     * 根据用户年龄查询用户信息（多个实体类对象）
     */
    List<User> selectUserByAge(@Param("age") Integer age);

    /**
     * 根据用户id查询用户名（单个数据）
     */
    String selectUsernameById(@Param("id") Integer id);

    /**
     * 根据用户名查询用户年龄（单个数据）
     * @return
     */
    int selectAgeByUsername(@Param("username") String username);

    /**
     * 根据用户 id 查询用户信息（单个实体类对象 Map）
     */
    Map<Integer, Object> selectUserById2Map(@Param("id") Integer id);

    /**
     * 查询所有用户信息（多个实体类对象 Map）
     */
    List<Map<Integer, Object>> selectAllUser2Map();

    /**
     * 查询所有用户信息（多个实体类对象 MapKey）
     */
    @MapKey("id")
    Map<Integer, Object> selectAllUserWithMapKey();
}
