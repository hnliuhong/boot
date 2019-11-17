package cn.oa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

// 注解扫描约定：自动会去扫描当前包和当前包的子包
@SpringBootApplication // (scanBasePackages = {"cn.oa.controller"})
@PropertySource(value = {"classpath:db.properties"})
public class BootApplication {
	// 此类boot的启动类,所有配置信息设置都应该在此类中
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
