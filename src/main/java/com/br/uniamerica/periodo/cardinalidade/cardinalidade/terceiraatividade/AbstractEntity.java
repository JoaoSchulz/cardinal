package com.br.uniamerica.periodo.cardinalidade.cardinalidade.terceiraatividade;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class AbstractEntity {

    @Id
    @Getter @Setter
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter @Setter
    @Column(name = "cadastrado", nullable = false)
    private LocalDateTime cadastro;
    @Getter @Setter
    @Column(name = "atualizado")
    private LocalDateTime atualizado;
    @Getter @Setter
    @Column(name = "ativo", nullable = false)
    private boolean ativo;

}
