package telran.org.scotlandyard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.org.scotlandyard.model.BasketState;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Baskets")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Basket_id")
    private Set<Good> goods = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private BasketState basketState;

}
