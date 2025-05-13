package com.study.test_back.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String description;

}

