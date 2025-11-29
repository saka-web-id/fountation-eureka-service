package id.web.saka.fountation.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class FountationEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FountationEurekaServiceApplication.class, args);
    }

}
