package pers.xinchan.mybatis.mapper.demo;

import pers.xinchan.mybatis.pojo.Product;

import java.util.List;

/**
 * @author xinchan
 * @version 1.0.1 2022-04-11
 */
public interface ProductMapper {
    /**
     * 添加商品
     */
    void insertProduct();

    /**
     * 更新商品信息
     */
    void updateProduct();

    /**
     * 删除商品信息
     */
    void deleteProduct();

    /**
     * 查询商品信息
     */
    Product selectProduct();

    /**
     * 查询所有商品信息
     */
    List<Product> selectAllProduct();
}
