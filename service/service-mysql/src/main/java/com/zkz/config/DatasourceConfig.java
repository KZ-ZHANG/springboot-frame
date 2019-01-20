package com.zkz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description:
 * @Auther: ZKZ
 * @Date: 2019/1/20
 **/
@Configuration
@PropertySource("classpath:datasource.properties")
public class DatasourceConfig {
}
