package io.github.luaprogrammer.localizacao.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_cidade")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cidade {

    @Id
    @Column(name = "id_cidade")
   // @GeneratedValue(generator = "uuid")
    //@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private Integer id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "qtd_habitantes")
    private Long habitantes;
}
