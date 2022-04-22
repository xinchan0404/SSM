package pers.xinchan.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pers.xinchan.mybatis.mapper.SQLMapper;
import pers.xinchan.mybatis.pojo.User;

import java.io.IOException;
import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-20
 */
public class SQLMapperTest {
    @Test
    public void testFuzzyQueryByUsername() throws IOException {
        SQLMapper mapper = MapperUtil.getMapper();
        List<User> users = mapper.fuzzyQueryByUsername("xin");
        users.forEach(System.out::println);
    }

    @Test
    public void testFuzzyQueryByPassword() throws IOException {
        SQLMapper mapper = MapperUtil.getMapper();
        List<User> users = mapper.fuzzyQueryByPassword("345");
        users.forEach(System.out::println);
    }

    @Test
    public void testDeleteUserById() throws IOException {
        SQLMapper mapper = MapperUtil.getMapper();
        mapper.deleteUserById("9, 10, 11");
    }

    @Test
    public void testSelectUserByTable() throws IOException {
        SQLMapper mapper = MapperUtil.getMapper();
        List<User> users = mapper.selectUserByTable("user");
        users.forEach(System.out::println);
    }
}
