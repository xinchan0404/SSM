package pers.xinchan.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pers.xinchan.mybatis.mapper.SelectMapper;
import pers.xinchan.mybatis.pojo.User;

import java.io.IOException;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-20
 */
public class SelectMapperTest {
    @Test
    public void testSelectUserById() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.selectUserById(6);
        System.out.println(user);
    }
}
