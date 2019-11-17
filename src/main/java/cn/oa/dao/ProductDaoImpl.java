package cn.oa.dao;

import cn.oa.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository(value = "productDao") // (value = "productDao")
public class ProductDaoImpl {
    // 此处应该依赖 jdbcTemplate (自动提交)  mybatis (手动提交)
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void save(Product product) {
        String sql = "insert into product (pname,pprice,premark) values (?,?,?)";
        System.out.println(product);
        jdbcTemplate.update(sql, new Object[]{product.getName(),product.getPrice(),product.getRemark()});
    }
}
