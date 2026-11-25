package web.mvc.cicd02_boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Cicd02BootApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("testing");
        throw new RuntimeException("fail");
    }

}
