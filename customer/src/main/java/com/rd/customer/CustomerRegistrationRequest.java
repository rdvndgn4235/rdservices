package com.rd.customer;

/**
 * Created at 6/22/22.
 *
 * @author Ridvan Dogan
 */
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
