package cn.oa.dao;

import cn.oa.model.Product;
import org.springframework.stereotype.Repository;

@Repository(value = "productDao") // (value = "productDao")
public class ProductDaoImpl {
    // 此处应该依赖 jdbcTemplate  mybatis

    public void save(Product product){
        System.out.println(this);
        System.out.println(product);
    }
}
