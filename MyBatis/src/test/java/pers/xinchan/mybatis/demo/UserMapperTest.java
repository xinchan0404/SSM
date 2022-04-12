package pers.xinchan.mybatis.demo;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pers.xinchan.mybatis.mapper.demo.UserMapper;
import pers.xinchan.mybatis.pojo.User;

import java.io.IOException;
import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-11
 */
public class UserMapperTest {
    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser();
    }

    @Test
    public void testUpdateUser() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
    }

    @Test
    public void testDeleteUser() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
    }

    @Test
    public void testSelectUser() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectUser();
        System.out.println(user);
    }

    @Test
    public void testSelectAllUser() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAllUser();
        users.forEach(System.out::println);
    }
}
