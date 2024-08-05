package telran.org.scotlandyard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.org.scotlandyard.model.BasketState;

import java.util.Date;
import java.util.HashMap;
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

    private String title;

    private Date orderDate = new Date();

    private double price;

    @Enumerated(EnumType.STRING)
    private OrderState state;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Set<TravelCard> travelCards = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Basket_id")
    private Map<Catalog, Integer> goods = new HashMap<>();

    @Enumerated(EnumType.STRING)
    private BasketState basketState;

}
