package telran.org.scotlandyard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "goods")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Date receipt_Data = new Date();

    private double price;

    private int count_good;

    private String category;

    private String image;


}
