package cn.oa.utils;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//注解有三种: 系统注解, 第三方注解，自定义注解
// @Target 注解可以声明的位置
// @Retention 生命周期 (source,class,runtime)
enum Color {  // 定义枚举类型(有限的值)
    RED, GREEN, BLUE;
}
// 自定义注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnn{
    // 注解可以指定值,赋值时直接通过属性名,获取值通过属性对应方法
    Color color() default Color.RED;   // 所有的属性必须设置值,当然可以配置缺省值
    int[] num() default {1,2,3};  //
    String name();   // 赋值 name = 'aaa'  取值: name()
    Resource res() default @Resource(name = "abc",type=String.class);
}

@MyAnnn(name = "test",num={100,200,300},
        color =Color.BLUE,
        res = @Resource(name = "AAA",type=Integer.class))  // 创建了自定义注解的实例
public class MyAnnoTest {
    public static void main(String[] args) {
        MyAnnn annotation = MyAnnoTest.class.getAnnotation(MyAnnn.class);
        if(annotation!=null){
            System.out.println(annotation.num());
            System.out.println(annotation.color());
            System.out.println(annotation.res());
            System.out.println(annotation.name());
        }
    }
}
