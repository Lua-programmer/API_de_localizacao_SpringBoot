package io.github.luaprogrammer.localizacao.domain.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "tb_cidade")
@Data
public class Cidade {

    @Id
    @Column(name = "id_cidade")
   // @GeneratedValue(generator = "uuid")
    //@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private Long id;

    @Column(name = "nome_cidade", length = 50)
    private String nome;

    @Column(name = "qtd_habitantes")
    private Long habitantes;
}
