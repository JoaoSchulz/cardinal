package com.br.uniamerica.periodo.cardinalidade.cardinalidade.primeiratividade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "td_usuario", schema = "primeiraatividade")
public class Usuario extends AbstractEntity{

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
    @JoinColumn(name = "id_endereco", nullable = false)
    @OneToOne(cascade = CascadeType.ALL ,fetch = FetchType.EAGER, optional = false)
    private Endereco endereco;

}
