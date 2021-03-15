package com.dy;

import com.dy.Config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @EnableConfigurationProperties
 * 告诉主程序入口类  要自动引入配置文件
 * 配置文件对应的类作为它的参数
 *
 * @author:SunG
 * @date 2021/3/15 22:55
 */
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }

    /**
     * 模块02介绍：
     * 1、实体类值的注入的三种方式
     * 2、多个bean配置
     * 3、多个配置文件的优先级
     * 4、加密 (多次测试，解密成功)
     */
}
