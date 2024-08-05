package telran.org.scotlandyard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import telran.org.scotlandyard.entity.Good;

@Entity
@Table(name = "catalog")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Catalog {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Good good;
}
