package com.vi.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration
public class MyWebConfig extends WebMvcConfigurationSupport {
    //@Configuration:
    // Spring 容器在启动时，会加载默认的一些PostPRocessor，其中就有 ConfigurationClassPostProcessor，
    // 这个后置处理程序专门处理带有@Configuration注解的类，这个程序会在bean定义加载完成后，
    // 在bean初始化前进行处理。其主要处理的过程就是使用 cglib 动态代理对类进行增强，
    // 使用增强后的类替换了beanFactory原有的 beanClass，增强类会对其中带有@Bean注解的方法进行额外处理，
    // 确保调用带@Bean注解的方法返回的都是同一个实例。


    //跨域访问
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
//        super.addCorsMappings(registry);
        System.out.println("addCorsMappings");
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("POST").maxAge(3600).allowCredentials(true);;
    }

    // 拦截器
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
        MyInterceptor interceptor = new MyInterceptor();
        System.out.println("addInterceptors");
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns("/login");
    }
}
