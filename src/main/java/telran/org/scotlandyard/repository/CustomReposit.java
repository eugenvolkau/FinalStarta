package telran.org.scotlandyard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import telran.org.scotlandyard.entity.Custom;

public interface CustomReposit extends JpaRepository<Custom, Long> {
//    public UserNotFoundException(String message) {// in exception
//        super(message);
//    }
}
