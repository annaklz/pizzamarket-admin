package pl.wszib.pizzamarket.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.pizzamarket.data.entities.OrderAddressEntity;

public interface OrderAddressRepository extends JpaRepository<OrderAddressEntity, Long> {
}
