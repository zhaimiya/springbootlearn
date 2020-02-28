package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import tk.mybatis.spring.annotation.MapperScan;
import vi.test.ApplicationRunnerTest;

@SpringBootApplication
@MapperScan(basePackages = "com.vi.mapper")
@ComponentScan(basePackages= {"com.vi","org.n3r.idworker","vi.test"})
@EnableAsync
public class IchatApplication {
//@SpringbootApplication相当于@Configuration,@EnableAutoConfiguration和 @ComponentScan
// 并具有他们的默认属性值
    public static void main(String[] args) {
        SpringApplication.run(IchatApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationRunnerTest.class);

        ApplicationRunnerTest applicationRunnerTest = (ApplicationRunnerTest)context.getBean(ApplicationRunnerTest.class);

        applicationRunnerTest.test("我是ApplicationRunnerTest.CLASS");
    }
}
