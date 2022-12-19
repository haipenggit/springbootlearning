package com.haipeng.springinitializer;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/***
 *
 * @SpringBootApplication
 * SpringBoot的启动类（入口）
 * @Configuration spring.xml 也是配置类
 * @ComponentScan = <context:component-scan basePackages="cn.tulingxueyuan"></context:component-scan>
 *
 * Spring底层在解析配置类， 回去解析@ComponentScan,读取basePackages，
 *      如果没有读取到，会将当前配置类所在的包当做扫描包
 *
 * 位置： 最好放在需要扫描包的根目录、或者说放在所有Bean的顶层目录中
 *
 */
@SpringBootApplication
public class SpringinitializerApplication {

    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication(SpringinitializerApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run(args);
        SpringApplication.run(SpringinitializerApplication.class, args);
//        new SpringApplicationBuilder().bannerMode(Banner.Mode.OFF).run(args);
    }

}
