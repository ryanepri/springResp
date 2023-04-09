package com.ryan.beanProcesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

/**
 * bean生命周期-编撰、配置后置处理器
 */
public class MyBeanProcesser implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //Object bean      实例化的bean
        //String beanName  bean的id
//      return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
        System.out.println("后置生命周期:初始化方法之后");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
        System.out.println("后置生命周期:初始化方法之后");
        return bean;
    }
}
