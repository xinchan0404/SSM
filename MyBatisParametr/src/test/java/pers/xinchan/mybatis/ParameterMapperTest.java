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
    public void testInsertUser() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        mapper.insertUser();
    }

    @Test
    public void testSelectUser() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> users = mapper.selectAllUser();
        users.forEach(System.out::println);
    }
}
