package com.practice.fullstack.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Table(name="student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="sid")

    private long sid;
    @Column(name="name")
    private  String name;
    @Column(name="email")
    private  String email;
}
