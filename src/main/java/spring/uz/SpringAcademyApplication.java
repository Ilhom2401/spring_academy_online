package spring.uz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringAcademyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAcademyApplication.class, args);
    }

}
