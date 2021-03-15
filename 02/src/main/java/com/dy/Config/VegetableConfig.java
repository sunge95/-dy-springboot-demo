package com.dy.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration
 * 声明这是一个配置类  在spring中可以替代xml文件
 * @ConfigurationProperties(prefix = "vegetables")
 * 声明这是配置文件类  并且声明前缀
 * @PropertySource("")
 * 声明文件对应的地址
 *
 * @author:SunG
 * @date 2021/3/15 23:13
 */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
//都可以
@Data
public class VegetableConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;
}
