package pers.xinchan.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import pers.xinchan.mybatis.pojo.User;

import java.util.List;

public interface SQLMapper {
    /**
     * 根据用户名模糊查询用户信息（模糊查询）
     */
    List<User> fuzzyQueryByUsername(@Param("username") String username);

    /**
     * 根据用户密码模糊查询用户信息（模糊查询）
     */
    List<User> fuzzyQueryByPassword(@Param("password") String password);

    /**
     * 根据用户 id 批量删除用户
     */
    void deleteUserById(@Param("ids") String ids);

    /**
     * 根据表名查询所有用户信息
     */
    List<User> selectUserByTable(@Param("table") String table);
}
