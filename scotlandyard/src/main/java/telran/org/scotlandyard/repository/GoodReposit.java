package telran.org.scotlandyard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import telran.org.scotlandyard.entity.Good;

public interface GoodReposit extends JpaRepository<Good, Long> {
}
