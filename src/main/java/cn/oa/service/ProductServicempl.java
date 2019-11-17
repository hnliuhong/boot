package cn.oa.service;

import cn.oa.dao.ProductDaoImpl;
import cn.oa.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "productService")
public class ProductServicempl {
    @Resource(name = "productDao")
    private ProductDaoImpl productDao;

    public void save(Product product) {
        productDao.save(product);
    }
}
