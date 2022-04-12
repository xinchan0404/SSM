package pers.xinchan.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pers.xinchan.mybatis.mapper.ProductMapper;
import pers.xinchan.mybatis.pojo.Product;

import java.io.IOException;
import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-11
 */
public class ProductMapperTest {
    @Test
    public void testInsertProduct() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        mapper.insertProduct();
    }

    @Test
    public void testUpdateProduct() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        mapper.updateProduct();
    }

    @Test
    public void testDeleteProduct() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        mapper.deleteProduct();
    }

    @Test
    public void testSelectProduct() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        Product product = mapper.selectProduct();
        System.out.println(product);
    }

    @Test
    public void testSelectAllProduct() throws IOException {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        List<Product> products = mapper.selectAllProduct();
        products.forEach(System.out::println);
    }
}
