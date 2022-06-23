package com.rd.customer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created at 6/22/22.
 *
 * @author Ridvan Dogan
 */

@Slf4j
@RestController
@RequestMapping("api/v1/customer")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping()
    public void register(@RequestBody CustomerRegistrationRequest customerRequest) {
        log.info("new customer regisration {}", customerRequest);
        customerService.register(customerRequest);
    }
}
