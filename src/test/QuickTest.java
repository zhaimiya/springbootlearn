package test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuickTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void getDataSource() {
        System.out.println(dataSource.getClass().getName());
    }
}
