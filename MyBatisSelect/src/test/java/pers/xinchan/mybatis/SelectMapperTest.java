package pers.xinchan.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pers.xinchan.mybatis.mapper.SelectMapper;
import pers.xinchan.mybatis.pojo.User;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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

    @Test
    public void testSelectUserByAge() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> users = mapper.selectUserByAge(25);
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectUsernameById() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        String username = mapper.selectUsernameById(6);
        System.out.println(username);
    }

    @Test
    public void testSelectAgeByUsername() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        int age = mapper.selectAgeByUsername("zhengxin");
        System.out.println(age);
    }

    @Test
    public void testSelectUserById2Map() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<Integer, Object> map = mapper.selectUserById2Map(7);
        System.out.println(map);
    }

    @Test
    public void testSelectAllUser2Map() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<Map<Integer, Object>> maps = mapper.selectAllUser2Map();
        maps.forEach(System.out::println);
    }

    @Test
    public void testSelectAllUserWithMapKey() throws IOException {
        SqlSession sqlSession = MapperUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<Integer, Object> maps = mapper.selectAllUserWithMapKey();
        System.out.println(maps);
    }
}
