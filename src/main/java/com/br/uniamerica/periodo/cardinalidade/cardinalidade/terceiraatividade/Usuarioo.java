package com.br.uniamerica.periodo.cardinalidade.cardinalidade.terceiraatividade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "td_usuario1", schema= "terceiraatividade")
public class Usuarioo extends AbstractEntity{

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Getter @Setter
    @Column(name = "cpf", length = 15, nullable = false, unique = true)
    private String cpf;
    @Getter @Setter
    @Column(name = "login", length = 20, nullable = false, unique = true)
    private String login;
    @Getter @Setter
    @Column(name = "senha", length = 20, nullable = false)
    private String senha;
    @Getter @Setter
    @JoinColumn(name = "td_usuario", nullable = false)
    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Telefone> telefone = new ArrayList<Telefone>();

}
