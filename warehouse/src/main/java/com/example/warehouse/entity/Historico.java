package com.example.warehouse.entity;

import javax.persistence.*;

@Entity
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Item item;

}
