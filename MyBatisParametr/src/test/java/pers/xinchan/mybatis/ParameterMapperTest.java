package pers.xinchan.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pers.xinchan.mybatis.mapper.ParameterMapper;
import pers.xinchan.mybatis.pojo.User;

import java.io.IOException;
import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-18
 */
public class ParameterMapperTest {
    @Test
    public void testSelectAllUser() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = mapper.selectAllUser();
        users.forEach(System.out::println);
    }

    @Test
    public void testUpdateUserById() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        mapper.updateUserById(7, "zhengxin");
    }

    @Test
    public void testSelectUserByUsername() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.selectUserByUsername("xinchan");
        System.out.println(user);
    }

    @Test
    public void testSelectUserByUP() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.selectUserByUP("zhengxin", "123456");
        System.out.println(user);
    }

    @Test
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        mapper.insertUser(new User(null, "admin", "hello", 100));
    }

    @Test
    public void testSelectUserByAge() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = mapper.selectUserByAge(25);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectUserByUA() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = mapper.selectUserByUA("xinchan", 25);
        users.forEach(System.out::println);
    }
}
