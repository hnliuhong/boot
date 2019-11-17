package cn.oa.service;

import cn.oa.dao.ProductDaoImpl;
import cn.oa.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service(value = "productService")
public class ProductServicempl {
    @Resource(name = "productDao")
    private ProductDaoImpl productDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Product product) {
        productDao.save(product);
//        Integer.parseInt("xxxxx");
    }
}
