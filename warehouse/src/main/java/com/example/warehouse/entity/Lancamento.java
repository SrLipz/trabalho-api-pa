package com.example.warehouse.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLancamento;
    @Column
    private String data;
    @Column
    private String tipo;

    @OneToOne
    private Colaborador colaborador;


}
