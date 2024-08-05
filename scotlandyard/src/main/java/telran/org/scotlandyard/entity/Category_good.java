package telran.org.scotlandyard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.GetMapping;
import telran.org.scotlandyard.service.CategoryGoodService;

import java.util.List;

@Entity
@Table(name = "Categorys")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryGood {

    private final CategoryGoodService categoryService;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @GetMapping
    public List<CategoryGood> list() {
        return categoryService.getByCategory();
    }

}
