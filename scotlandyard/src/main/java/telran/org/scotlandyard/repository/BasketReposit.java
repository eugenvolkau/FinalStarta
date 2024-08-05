package telran.org.scotlandyard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import telran.org.scotlandyard.entity.Basket;

public interface BasketReposit extends JpaRepository<Basket, Long> {
}
