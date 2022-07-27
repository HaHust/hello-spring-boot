package vn.h2s.hanvdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HanvdevApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanvdevApplication.class, args);
    }

    @GetMapping("/hi")
    public String hello() {
        return "Hello Ha";
    }
}
