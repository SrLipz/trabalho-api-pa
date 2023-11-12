package com.example.warehouse.entity;

import javax.persistence.*;

@Entity
public class ItemLancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Lancamento lancamento;

    @OneToOne
    private Historico historico;

    @Column
    private int quantidade;
}
