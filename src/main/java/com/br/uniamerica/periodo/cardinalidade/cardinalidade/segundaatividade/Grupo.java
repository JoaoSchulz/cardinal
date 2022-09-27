package com.br.uniamerica.periodo.cardinalidade.cardinalidade.segundaatividade;

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
@Table(name = "td_grupo", schema = "segundaatividade")
public class Grupo extends AbstractEntity{

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Getter @Setter
    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;
    @Getter @Setter
    @JoinColumn(name = "permissao", nullable = false)
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Permissao> permissao = new ArrayList<Permissao>();
}