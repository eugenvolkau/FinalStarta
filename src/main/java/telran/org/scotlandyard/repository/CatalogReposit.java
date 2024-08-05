package telran.org.scotlandyard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import telran.org.scotlandyard.entity.Catalog;

public interface CatalogReposit extends JpaRepository<Catalog, Long> {
}
