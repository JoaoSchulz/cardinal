package com.br.uniamerica.periodo.cardinalidade.cardinalidade.segundaatividade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "td_permissao", schema = "segundaatividade")
public class Permissao extends AbstractEntity{

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false, unique = true)
    private String nome;
    @Getter @Setter
    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;
    @Getter @Setter
    @Column(name = "regra", length = 100, nullable = false, unique = true)
    private String regra;
    @Getter @Setter
    @Column(name = "funcionalidade", length = 100, nullable = false)
    private String funcionalidade;
    @Getter @Setter
    @Column(name = "acao", length = 100, nullable = false)
    private String acao;

}
