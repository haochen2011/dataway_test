package dataway_test;

import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableHasor()
@EnableHasorWeb()
@SpringBootApplication(scanBasePackages = { "dataway_test.net.example.hasor" })
public class DatawayTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatawayTestApplication.class, args);
    }

}
