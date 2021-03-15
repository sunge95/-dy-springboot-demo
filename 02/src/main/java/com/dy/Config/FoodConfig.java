package com.dy.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties 需要在主函数入口处配置
 * @EnableConfigurationProperties(FoodConfig.class)
 *
 * @author:SunG
 * @date 2021/3/15 23:05
 */
@Data
@ConfigurationProperties(prefix = "food")
public class FoodConfig {
    private String meat;
    private String rice;
    private String[] sauce;
}
