package com.events.api.repositorires;
import com.events.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface CouponRepository extends JpaRepository<Event, UUID> {

}
