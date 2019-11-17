package cn.oa.utils;

import cn.oa.service.ProductServicempl;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
@Component
public class InitDataListener implements ServletContextListener{

    private ServletContext servletContext = null;
    private ApplicationContext context = null;

    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("contextInitialized.................");
        servletContext = event.getServletContext();
        context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ProductServicempl productService = context.getBean("productService", ProductServicempl.class);
        System.out.println(productService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("contextDestroyed.................");
    }
}
