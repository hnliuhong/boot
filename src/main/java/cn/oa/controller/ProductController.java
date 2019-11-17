package cn.oa.controller;



import cn.oa.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/product")
@Controller
public class ProductController {

    @RequestMapping("/save")
    @ResponseBody // 此标签支持返回json或者text
    public String save(Product product){
        System.out.println(product);
        return "Hello Boot";
    }
}
