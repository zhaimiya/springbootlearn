package vi.test;

import javax.annotation.PostConstruct;

public class PostConstructTest {
    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstructTest...");
    }
}
