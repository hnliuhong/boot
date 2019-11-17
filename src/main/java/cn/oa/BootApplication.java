package cn.oa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 注解扫描约定：自动会去扫描当前包和当前包的子包
@SpringBootApplication (scanBasePackages = {"cn.oa.controller"})
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
