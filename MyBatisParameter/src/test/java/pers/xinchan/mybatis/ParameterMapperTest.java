package pers.xinchan.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pers.xinchan.mybatis.mapper.ParameterMapper;
import pers.xinchan.mybatis.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-12
 */
public class ParameterMapperTest {
    @Test
    public void testGetAllUser() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = build.openSession(true);
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> allUser = mapper.getAllUser();
        allUser.forEach(System.out::println);
    }
}
