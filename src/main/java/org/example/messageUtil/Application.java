package org.example.messageUtil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring Boot Application.
 * 
 *
 */
@SpringBootApplication
public class Application
{

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String home()
    {
        return "Hello Docker World";
    }

}