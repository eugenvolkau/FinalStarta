package telran.org.scotlandyard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "custom")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Custom {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phoneNum;

    private String password;

    private String role = "ROLE_CUSTOM";
}
