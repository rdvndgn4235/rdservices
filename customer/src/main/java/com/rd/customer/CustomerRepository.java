package com.rd.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created at 6/23/22.
 *
 * @author Ridvan Dogan
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
