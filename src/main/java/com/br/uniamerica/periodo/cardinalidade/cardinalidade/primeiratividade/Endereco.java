package com.br.uniamerica.periodo.cardinalidade.cardinalidade.primeiratividade;

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
@Table(name = "td_endereco", schema = "primeiraatividade")
public class Endereco extends AbstractEntity{

    @Getter @Setter
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Getter @Setter
    @Column(name = "endereco", length = 100, nullable = false)
    private String endereco;
    @Getter @Setter
    @Column(name = "numero", length = 20, nullable = false)
    private String numero;
    @Getter @Setter
    @Column(name = "cep", length = 8, nullable = false)
    private String cep;
    @Getter @Setter
    @Column(name = "bairro", length = 100, nullable = false)
    private String bairro;

}
