package telran.org.scotlandyard.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

   @Entity
    @Table(name = "employees")
    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public class Employee {

        @Id()
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String email;

        private String phoneNum;

        private String password;


    }


