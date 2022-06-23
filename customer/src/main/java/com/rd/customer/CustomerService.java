package com.rd.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created at 6/22/22.
 *
 * @author Ridvan Dogan
 */
@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check if mail valid
        // todo: check if mail not taken
        // todo: check if fraudster
        customerRepository.save(customer);
        // todo: send notification
    }
}
