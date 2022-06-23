package com.rd.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created at 6/22/22.
 *
 * @author Ridvan Dogan
 */
@SpringBootApplication(
        scanBasePackages = {
                "com.rd.customer",
                "com.rd.amqp"
        }
)
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.rd.clients")
//@PropertySources({
//        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
//})
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
