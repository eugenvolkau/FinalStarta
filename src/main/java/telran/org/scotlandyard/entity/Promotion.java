package telran.org.scotlandyard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "promotions")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double discount;

    //change the price of each item
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Promotion_id")
    private Set<Good> promoGoods = new HashSet<>();

}
