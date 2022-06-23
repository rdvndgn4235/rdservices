package com.rd.notification;

/**
 * Created at 6/23/22.
 *
 * @author Ridvan Dogan
 */
public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {
}
