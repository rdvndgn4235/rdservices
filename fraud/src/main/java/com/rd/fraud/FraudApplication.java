package com.rd.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created at 6/23/22.
 *
 * @author Ridvan Dogan
 */
@SpringBootApplication
@EnableEurekaClient
//@PropertySources({
//        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
//})
public class FraudApplication {
    public static void main(String[] args) {
        SpringApplication.run(FraudApplication.class, args);
    }
}
