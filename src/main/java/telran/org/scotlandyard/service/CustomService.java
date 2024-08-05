package telran.org.scotlandyard.service;

import telran.org.scotlandyard.entity.Custom;

import java.util.List;
import java.util.Optional;

public interface CustomService {

    List<Custom> getAll();

    Custom getById(Long id);

    void deleteById(long id);

    Custom create(Custom custom);

    Optional<Custom> findByEmail(String email);
}
