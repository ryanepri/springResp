package com.ryan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 配置类
 */
@Configuration
@ComponentScan(basePackages = "com.ryan")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
