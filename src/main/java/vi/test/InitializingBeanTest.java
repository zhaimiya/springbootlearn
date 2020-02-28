package vi.test;

import org.springframework.beans.factory.InitializingBean;

public class InitializingBeanTest implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBeanTest ****");
    }
}
