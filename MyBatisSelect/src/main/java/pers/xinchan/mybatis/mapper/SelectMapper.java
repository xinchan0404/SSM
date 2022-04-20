package pers.xinchan.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import pers.xinchan.mybatis.pojo.User;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-20
 */
public interface SelectMapper {
    /**
     * 根据用户 id 查询用户信息（单个实体类对象）
     */
    User selectUserById(@Param("id") Integer id);
}
