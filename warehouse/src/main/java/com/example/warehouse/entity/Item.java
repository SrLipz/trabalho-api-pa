package com.example.warehouse.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItem;
    @Column
    private String nomeItem;
    @Column
    private String descricao;
    @Column
    private int qtdEstoque;



}
