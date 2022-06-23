package com.rd.notification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created at 6/23/22.
 *
 * @author Ridvan Dogan
 */
@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
