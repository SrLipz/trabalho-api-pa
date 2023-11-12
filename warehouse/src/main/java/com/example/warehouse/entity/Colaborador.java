package com.example.warehouse.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idColaborador;
    @Column
    private String nomeColaborador;
    @Column
    private String cpf;
    @Column
    private String telefone;
    @Column
    private String email;
    @Column
    private String senha;

    @OneToMany
    private List<Lancamento> lancamento;
}
