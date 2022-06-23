package com.rd.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Created at 6/23/22.
 *
 * @author Ridvan Dogan
 */
@SpringBootApplication(
        scanBasePackages = {
                "com.rd.notification",
                "com.rd.amqp"
        }
)
//@PropertySources(
//        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
//)
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }
}
