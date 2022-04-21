package pers.xinchan.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pers.xinchan.mybatis.mapper.SQLMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-20
 */
public class MapperUtil {
    public static SQLMapper getMapper() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = build.openSession(true);
        return sqlSession.getMapper(SQLMapper.class);
    }
}
