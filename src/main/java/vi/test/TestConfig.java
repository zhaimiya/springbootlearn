package vi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigurationTest.class);
        MyBeanTest myBeanTest = (MyBeanTest)context.getBean(MyBeanTest.class);
        myBeanTest.test();
    }
}
