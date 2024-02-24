package net.weg.apivendalacteos.repository;

import net.weg.apivendalacteos.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Collection<Order> findOrdersByDemandedFalse();

}
