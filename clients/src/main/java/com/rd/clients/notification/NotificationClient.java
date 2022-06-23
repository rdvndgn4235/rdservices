package com.rd.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created at 6/23/22.
 *
 * @author Ridvan Dogan
 */
@FeignClient(
        name = "notification",
        url = "http://localhost:8082"
)
public interface NotificationClient {
    @PostMapping("api/v1/notification")
    void sendNotification(NotificationRequest notificationRequest);
}
