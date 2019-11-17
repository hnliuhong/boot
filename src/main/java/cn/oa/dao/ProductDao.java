package cn.oa.dao;

import cn.oa.model.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

// dao service都应该声明接口(面向接口编程)
// 接口的类全名,必须是Mapper映射文件的命名空间
// 调用的方法名必须与mapper中的id相同
@Repository(value = "productDao")
public interface ProductDao {

    List<Product> queryByName(@Param("keyword") String name, @Param("start") int start, @Param("size") int size);

    Product getById(int id);

    int update(Product product);

    int delete(int id);

    int save(Product product);
}
