package vi.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyBeanTest.class)
public class MyConfigurationTest {

    public MyConfigurationTest() {
        System.out.println("MyConfigurationTest()   *******");
    }
}
