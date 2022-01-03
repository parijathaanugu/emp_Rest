package com.practice.fullstack.model;


import lombok.*;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Table(name="employee")
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name="id")
    private long id;
   @Column(name="first_name")
    private  String firstName;
   @Column(name="last_name")
    private  String lastName;
   @Column(name="email")
    private  String email;
}
